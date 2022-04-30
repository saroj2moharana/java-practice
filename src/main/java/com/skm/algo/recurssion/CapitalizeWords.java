package com.skm.algo.recurssion;

/**
 * @Author saroj on 30/04/22
 **/
public class CapitalizeWords {
    public static void main(String[] args) {
        String s = "i love you";//expected should be I Love You...
        String r = capitalize(s);
        System.out.println("After conversion:"+r);
    }
    public static String capitalize(String str){
        //   TODO
        if(str.indexOf(" ") ==  -1) return str;
        return str.substring(0,1).toUpperCase()+" "+str.substring(2,str.indexOf(" ")) + capitalize(str.substring(str.indexOf(" "),str.length()).trim());
    }
}
