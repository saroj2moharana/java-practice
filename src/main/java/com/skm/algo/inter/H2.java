package com.skm.algo.inter;

/**
 * @author saroj on 9/4/2020
 */
public class H2 {
    public static void main(String[] args) {
        String accountNumber = "1178611429123456";
        if(accountNumber.startsWith("11786")) {
            System.out.println(accountNumber+"-------"+accountNumber.indexOf("11786"));
            accountNumber = accountNumber.substring(5);
        }
        System.out.println(accountNumber);
    }
}
