package com.skm.algo.java8.grouping;

/**
 * @author saroj on 10/11/2019
 */
public class Person {
    private String city;
    private String name;
    private String state;

    public Person(String name, String state,String city) {
        this.city = city;
        this.name = name;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("city='").append(city).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCityState(){
        StringBuilder str = new StringBuilder(getState());
        str.append("-").append(getCity());
        return str.toString();
    }
}
