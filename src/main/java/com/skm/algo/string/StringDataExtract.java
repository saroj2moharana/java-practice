package com.skm.algo.string;

/**
 * @author saroj on 2/12/2020
 */
public class StringDataExtract {
    public static void main(String[] args) {
        //"hpiTransactionId":"HPI3828BB322318BF","merchantTransactionReferenceNumber"
        String str = "\"hpiTransactionId\":\"HPI3828BB322318BF\",\"merchantTransactionReferenceNumber\"";
        System.out.println(str.indexOf("HPI"));
        String restOfStr = str.substring(str.indexOf("HPI"));
        System.out.println(restOfStr);

        int startIndex = str.indexOf("HPI");
        int lastIndex = startIndex + str.substring(str.indexOf("HPI")).indexOf("\"");
        System.out.println(str.substring(startIndex,lastIndex));
    }
}
