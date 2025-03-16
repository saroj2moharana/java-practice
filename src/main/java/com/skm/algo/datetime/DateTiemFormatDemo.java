package com.skm.algo.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTiemFormatDemo {
    public static void main(String[] args) {
        (new DateTiemFormatDemo()).dateTimeDisplay();
    }
    private void dateTimeDisplay(){
        String date1 = "2024-06-15T12:38:00+0000";
        String date2 = "2024-06-15T12:38:00Z";
        Instant instant = parseDate(date1);
        System.out.println(instant);
        System.out.println(parseDate(date2));

    }
    private Instant parseDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ").withZone(ZoneId.of("UTC"));
        return Instant.from(formatter.parse(date));
    }
}
