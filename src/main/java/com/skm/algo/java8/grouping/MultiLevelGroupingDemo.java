package com.skm.algo.java8.grouping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author saroj on 10/11/2019
 */
public class MultiLevelGroupingDemo {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("saroj","OD","CTC"));
        personArrayList.add(new Person("saroj1","OD","BBSR"));
        personArrayList.add(new Person("saroj2","OD","CTC"));
        personArrayList.add(new Person("saroj3","OD","CTC"));
        personArrayList.add(new Person("saroj4","OD","PURI"));

        personArrayList.add(new Person("saroj5","AP","CTC"));
        personArrayList.add(new Person("saroj6","MP","CTC"));
        personArrayList.add(new Person("saroj7","AP","CTC"));
        personArrayList.add(new Person("saroj8","MP","CTC1"));

        Map<String, List<Person>> personsByCountry = personArrayList.stream().collect(Collectors.groupingBy(Person::getCityState));
        System.out.println("PersonByCountry:"+personsByCountry);
        int totalCount = personArrayList.stream().collect(Collectors.groupingBy(Person::getCityState)).size();
        System.out.println("TotalGroup is:"+totalCount);
    }
}
