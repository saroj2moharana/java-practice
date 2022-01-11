package com.skm.algo.interview.drone;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by saroj on 7/15/2019.
 */
public class DroneApplication {
    public static void main(String arg[]){
        Queue<Product> sharedQueue = new LinkedList<Product>();
        Thread commandCenterThread = new Thread(new CommandCenter(sharedQueue));
        Thread droneThread = new Thread(new Drone(sharedQueue));

        commandCenterThread.start();
        droneThread.start();
    }
}
