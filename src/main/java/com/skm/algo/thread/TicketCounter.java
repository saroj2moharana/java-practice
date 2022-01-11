package com.skm.algo.thread;

/**
 * Created by saroj on 6/8/2019.
 */
public class TicketCounter {
    private int totalSeats;
    public TicketCounter(int totalSeats){
        this.totalSeats = totalSeats;
    }
    public synchronized void bookTicket(String name,int numberOfSeats){
        if(totalSeats > 0 && numberOfSeats<=totalSeats){
            System.out.println("Congrats "+name+", Your Ticket Booked successfully...");
            totalSeats = totalSeats - numberOfSeats;
        }else{
            System.out.println("Oops... "+name+", There are only "+totalSeats+" seats available...");
        }
        //this is the other way we can synchronize correctly but its not convenient way...
        /*try {
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            System.out.println(ex);
        }*/
    }
}
