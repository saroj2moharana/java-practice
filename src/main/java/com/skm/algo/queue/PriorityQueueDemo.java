package com.skm.algo.queue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author saroj on 10/24/2019
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        /*PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("saroj");
        System.out.println("Queue after insertion:"+priorityQueue);
        priorityQueue.add("mukesh");
        System.out.println("Queue after insertion:"+priorityQueue);
        priorityQueue.add("rakesh");
        System.out.println("Queue after insertion:"+priorityQueue);
        priorityQueue.add("somesh");
        System.out.println("Queue after insertion:"+priorityQueue);
        priorityQueue.add("saroj");
        System.out.println("Queue after insertion:"+priorityQueue);
        priorityQueue.contains("saroj");*/


        Map<String, Integer> map
                = new HashMap<String, Integer>();

        // Putting key-value pairs in map
        map.put("A", 15);
        map.put("B", 10);
        map.put("C", 25);
        map.put("D", 20);

        // Print the map
        System.out.println("Map: " + map);

        // getting minimum value using min()
        String minKey = Collections.min(map.keySet());

        // getting maximum value using max()
        String maxKey = Collections.max(map.keySet());

        // printing the minimum value
        System.out.println("Minimum Key of Map is: "
                + minKey);
        System.out.println("Value corresponding to "
                + "minimum Key of Map is: "
                + map.get(minKey));

        // printing the maximum value
        System.out.println("Maximum Key of Map is: " + maxKey);
        System.out.println("Value corresponding to "
                + "maximum Key of Map is: "
                + map.get(maxKey));

    }
}
