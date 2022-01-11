package com.skm.algo.java8.grouping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author saroj on 9/21/2020
 */
public class DateDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now().minusDays(1);
        ZonedDateTime yesterday = ZonedDateTime.now().minusDays(1);
        System.out.println(today);
        System.out.println(yesterday);
        System.out.println(Calendar.getInstance().getTime());
        DateTimeFormatter oldPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String st = oldPattern.format(today);
        System.out.println(st);
        System.out.println(new SimpleDateFormat("yyyyMMdd,HHmmss").format(new Date()));
        System.out.println(LocalDate.now().minusDays(1).atStartOfDay());
        System.out.println(LocalDate.now().atStartOfDay());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = new Date(System.currentTimeMillis());
        System.out.println("result is "+ dateFormat.format(myDate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.add(Calendar.DATE, 0);
        System.out.println(dateFormat.format(cal.getTime()));
    }
}
