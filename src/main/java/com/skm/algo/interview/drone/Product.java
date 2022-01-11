package com.skm.algo.interview.drone;

/**
 * Created by saroj on 7/15/2019.
 */
public class Product {
    private String name;
    private String deliveryAddress;
    private Status status;

    enum Status{
        INITIATED,DELIVERED,
    }

    public Product(String name, String deliveryAddress) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.status = Status.INITIATED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isDelivered(){
        return this.status == Status.DELIVERED;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", deliveryAddress='").append(deliveryAddress).append('\'');
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
