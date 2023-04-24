package com.skm.algo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author saroj on 24/04/23
 */
public class SmashStones {
    public static void main(String[] args) {
        int[] stones = new int[]{2,7,4,1,8,1};
        int res = smashStones(stones);
        System.out.println(res);
    }
    static int smashStones(int s[]){
        List<Integer> list = Arrays.stream(s).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());
        while(list.size()>1){
            //first 2 elements are eligible for smashing...
            int res = list.get(0)-list.get(1);
            list.remove(0);
            list.remove(0);
            if(res != 0) list.add(0,res);
            list.sort(Comparator.reverseOrder());
        }
        return list.isEmpty()?0:list.get(0);
    }

    /*static int smashStones1(int s[]){
        Arrays.sort(s);
        int start = 0;
        int end = s.length-1;
        while(start<end){
            int res = s[end]-s[end-1];
            if(res == 0) end = end-2;
            else{
                s[end-1] = res;
                end = end - 1;
                //re arrange the array in sorting order
            }
        }
        return list.isEmpty()?0:list.get(0);
    }*/
}
