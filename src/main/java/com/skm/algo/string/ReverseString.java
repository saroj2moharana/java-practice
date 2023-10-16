package com.skm.algo.string;

/**
 * @author saroj on 16/10/23
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String res = rs.reverseWords("i.like.this.program.very.much");
        System.out.println(res);
    }
    private String reverseWords(String s){   // code here
        if(!s.contains(".")) return s;
        return reverseWords(s.substring(s.indexOf('.')+1))+"."+s.substring(0,s.indexOf('.'));
    }
}
