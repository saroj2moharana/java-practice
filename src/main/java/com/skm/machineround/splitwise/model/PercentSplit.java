package com.skm.machineround.splitwise.model;

/**
 * @Author saroj on 16/05/22
 **/
public class PercentSplit extends Split{
    double percent;

    public PercentSplit(User user, double percent) {
        super(user);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
