package com.skm.algo.datetime;

import java.time.LocalDate;

/**
 * @Author saroj on 09/03/22
 **/
public class DateTimeDemo {
    public static void main(String arg[]){
        String str = "2022-03-09";
        boolean flag = LocalDate.parse(str).isEqual(LocalDate.now());
        System.out.println(flag);
    }
}
