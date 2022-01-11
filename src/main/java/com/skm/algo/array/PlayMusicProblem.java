package com.skm.algo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author SAROJ on 21-10-2021
 * we have an int array, we need to calculate pair of elements which will divisible by a specific number
 * e.g. [10,50,100,80,130] and number is 60 then pair would be :
 *
 */
public class PlayMusicProblem {
    public static void main(String[] args) {
        //int ar[] = {10,50,100,80,130};
        int ar[] = {60,60,60};
        int n = 60;
        System.out.println(countPairs(ar,n));//it will give wrong one...
        System.out.println(countPairsOptimized(ar,n));
    }
    public static int countPairs(int ar[], int n){
        int counter = 0;
        for(int i=0; i<ar.length; i++){
            for(int j=i; j<ar.length; j++){
                if((ar[i]+ar[j])%n ==0) counter++;
            }
        }
        return counter;
    }
    public static int countPairsOptimized(int a[], int n){
        //form reminder and its count in a map...
        Map<Integer,Integer> map = Arrays.stream(a).boxed().collect(Collectors.toMap(k->k%n, v->1, Integer::sum, LinkedHashMap::new));
        AtomicInteger counter = new AtomicInteger();
        //iterate only half of the n value let say if it's 60 then it should go till 30 because other part will be the mirror of this one...
        map.entrySet().parallelStream().filter(entry -> entry.getKey()<=n/2).forEach(entry -> {
            if((entry.getKey() == n/2 || entry.getKey()==0) && entry.getValue()>=2){//if rem == 30 or 0 then check at least there should be 2 reminders otherwise we can't form a pair...
                Integer value = ((entry.getValue()-1) * entry.getValue())/2;
                if(value != null) counter.addAndGet(value);
            }else if(entry.getKey()<n/2){
              Integer value = map.get(n-entry.getKey());
              if(value != null) counter.addAndGet(value*entry.getValue());
            }
        });


        return counter.get();
    }
}
