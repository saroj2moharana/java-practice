package com.skm.algo.thread;

/**
 * Created by saroj on 6/8/2019.
 */
public class FlightBookingApplication {
    public static void main(String arg[]){
        TicketCounter ticketCounter = new TicketCounter(3);//resource...

        TicketBooking ticketBooking = new TicketBooking("Saroj",2,ticketCounter);
        Thread t1 = new Thread(ticketBooking);

        TicketBooking ticketBooking2 = new TicketBooking("Sony",3,ticketCounter);
        Thread t2 = new Thread(ticketBooking2);

        t1.start();
        t2.start();
    }
}
