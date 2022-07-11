package com.skm.algo.java8.grouping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author saroj on 28/04/22
 **/
public class ConvertMapDemo {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("saroj","OD","CTC"));
        personArrayList.add(new Person("saroj1","OD","BBSR"));
        personArrayList.add(new Person("saroj2","OD","CTC"));
        personArrayList.add(new Person("saroj3","OD","CTC"));

        Map<String,Person> map = personArrayList.stream().collect(Collectors.toMap(Person::getName,person -> person));
        Map<String,Person> map1 = personArrayList.stream().collect(Collectors.toMap(Person::getName, Function.identity()));
        //third argument is the merger, it is needed when same key is there...
        //fourth argument is the map type...
        Map<String,Person> map2 = personArrayList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(a,b)->{return a;},LinkedHashMap::new));
        Map<String,List<String>> map3 = personArrayList.stream().collect(Collectors.groupingBy(
                Person::getCity,
                Collectors.mapping(
                        Person::getName, Collectors.toList())));
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);

        personArrayList.stream().map(Person::getName).collect(Collectors.toList());
    }
}
