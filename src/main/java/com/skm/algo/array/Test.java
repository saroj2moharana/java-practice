package com.skm.algo.array;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Test{
    public static void main(String arg[]){
        /*ArrayList<String> al = new ArrayList<String>();
        al.add("daroj");
        al.add("sdfd");
        al.add("bsfds");
        Collections.sort(al);
        System.out.println(al);
        String a[] = al.toArray(new String[al.size()]);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int temp= 5/4;
        int ar[] = new int[5];
        Arrays.sort(ar);
        boolean flag = false;
        display(flag);
        display(!flag);*/

        LocalDateTime localDateTime = LocalDateTime.parse("2018-09-16T08:00:00");
        System.out.println(localDateTime);


    }
    public static void display(boolean flag){
        System.out.println(flag);
    }
}