package com.skm.algo.regex;

import java.util.Arrays;

/**
 * @Author saroj on 11/05/22
 **/
public class SplitString {
    public static void main(String[] args) {
        String str = "Shivsena Bhavan India   \"19.024884357200627, 72.84045038184053\"\n" +
                "Varsha Bungalow India   \"18.952842433641795, 72.79980836498898\"";
        String[] tokens = str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
        System.out.println(Arrays.toString(tokens));
        System.out.println(tokens.length);
    }
}
