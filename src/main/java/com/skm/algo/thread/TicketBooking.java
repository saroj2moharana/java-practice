package com.skm.algo.thread;

/**
 * Created by saroj on 6/8/2019.
 */
public class TicketBooking implements Runnable {
    private String name;
    private int seats;
    private TicketCounter ticketCounter;

    public TicketBooking(String name, int seats, TicketCounter ticketCounter){
        this.name = name;
        this.seats = seats;
        this.ticketCounter = ticketCounter;
    }

    public void run(){
        ticketCounter.bookTicket(name,seats);
    }
}
