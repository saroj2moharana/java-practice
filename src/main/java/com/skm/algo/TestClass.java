package com.skm.algo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author saroj on 12/22/2019
 */
public class TestClass {
    public static final BigDecimal CENTS_PLACE = new BigDecimal(100);
    public static void main(String[] args) {
        /*String[] str = solution(4,6);
        for(String str1 : str){
            System.out.println(str1);
        }*/

        String str = "12030";
        BigDecimal bigDecimal = new BigDecimal(str);
        bigDecimal = bigDecimal.divide(CENTS_PLACE);
        System.out.println(String.format("%.2f",bigDecimal));

    }
    public static String[] solution(int N, int K) {
        if (N == 0) {
            return new String[] {""};
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String p : solution(N - 1, K - 1)) {
            char[] chars = new char[] {'a', 'b', 'c'};
            for (char l : chars) {
                //int pLen = p.length();
                if (p.length() == 0 || p.charAt(p.length() - 1) != l) {
                    result.add(p + l);
                }
            }
        }
        int prefSize = Math.min(result.size(), K);
        return result.subList(0, prefSize).toArray(new String[prefSize]);
        //return result.toArray(new String[K]);
    }
}
