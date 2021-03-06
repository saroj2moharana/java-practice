package com.skm.algo.string;

import java.security.MessageDigest;

/**
 * @author saroj on 11/28/2019
 */
public class MessageDigestConvertion {
    public static void main(String[] args) throws Exception {
        String password = "123456";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++)
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));

        System.out.println("Digest(in hex format):: " + sb.toString());
    }
}
