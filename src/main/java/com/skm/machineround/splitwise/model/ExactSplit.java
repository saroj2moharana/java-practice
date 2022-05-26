package com.skm.machineround.splitwise.model;

/**
 * @Author saroj on 16/05/22
 **/
public class ExactSplit extends Split{
    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }
}
