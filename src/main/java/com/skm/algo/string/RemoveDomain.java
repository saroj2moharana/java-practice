package com.skm.algo.string;

/**
 * @author saroj on 04/07/23
 */
public class RemoveDomain {
    public static void main(String[] args) {
        String str = "https://s3.us-east-1.amazonaws.com/nearengage-sandbox/engage/custom/d53437d/saroj-places-test_6493e71294ed64689b229a66.json";
        str = "s3://"+str.substring(str.indexOf(".com")+5);
        System.out.println(str);

    }
}

