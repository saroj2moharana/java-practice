package com.skm.algo.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @author saroj on 24/04/23
 */
public class SmashStones {
    public static void main(String[] args) {
        int[] stones = new int[]{2,7,4,1,8,1};
        int res = smashStonesUsingHeap(stones);
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

    /**
     * By using maxHeap it always gives max element from root...
     * It will take O(nlogn)
     * @param s
     * @return
     */
    static int smashStonesUsingHeap(int s[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:s)
            pq.add(i);
        while (pq.size()>1){
            int r = pq.poll()-pq.poll();
            if(r > 0) pq.add(r);
        }
        return pq.size()==0?0:pq.poll();
    }
}
