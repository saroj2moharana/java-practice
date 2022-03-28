package com.skm.algo.map;

import java.net.SocketOption;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author saroj on 07/03/22
 **/
public class ValueSum {
    public static void main(String[] args) {
        Map<String, Long> prices = new HashMap<>();
        prices.put("2022-03-01",10l);
        prices.put("2022-03-02",10l);
        prices.put("2022-03-03",10l);
        prices.put("2022-03-04",10l);
        prices.put("2022-03-05",10l);
        prices.put("2022-03-06",10l);
        prices.put("2022-03-07",10l);

        Long total = prices.entrySet().stream().filter(e-> LocalDate.parse(e.getKey()).isBefore(LocalDate.now())).mapToLong(e -> e.getValue()).sum();
        System.out.println(total);
    }
}
