package com.skm.algo.string;

/**
 * Created by saroj on 6/8/2019.
 */
public class StringEquality {
    public static void main(String arg[]){
        String s1 = "Saroj";
        String s2 = new String("Saroj");
        String s3 = new String("Saroj");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2.intern());//true
        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true

        StringBuffer sb1 = new StringBuffer("saroj");
        StringBuffer sb2 = new StringBuffer("saroj");
        boolean flag = sb1.equals(sb2);
        System.out.println("sb-equalityCheck:"+flag);//false as equals method hasn't overridden in StringBuffer and its using Object
        //class equals method where it is checking reference equality...

        StringBuilder sb3 = new StringBuilder("saroj");
        StringBuilder sb4 = new StringBuilder("saroj");
        boolean flag1 = sb3.equals(sb4);
        System.out.println("sbldr-equalityCheck:"+flag1);//false as equals method hasn't overridden in StringBuffer and its using Object
        //class equals method where it is checking reference equality...
    }
}
