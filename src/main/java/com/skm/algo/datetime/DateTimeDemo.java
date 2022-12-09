package com.skm.algo.datetime;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author saroj on 09/03/22
 **/
public class DateTimeDemo {
    public static void main(String arg[]){
        String str = "2022-03-09";
        boolean flag = LocalDate.parse(str).isEqual(LocalDate.now());
        System.out.println(flag);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        DateTime now = DateTime.parse(str).toDateTime();
        System.out.println(now);
        /*DateTime currentdate = formatter.parseDateTime(str).minusDays(2);
        System.out.println(currentdate);*/
        System.out.println(now.withTimeAtStartOfDay());

        System.out.println();
    }
}
