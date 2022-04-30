package com.skm.algo.recurssion;

/**
 * @Author saroj on 30/04/22
 **/
public class PalindromeCheck {
    public static void main(String[] args) {
        String a = "tacocat";
        boolean r = checkPalindrome(a);
        System.out.println("CheckPalindrome:"+r);
    }
    //complexity would be n/2
    public static boolean checkPalindrome(String a){
        int l = a.length();
        if(l == 1) return true;
        return (
                    (a.charAt(0) == a.charAt(l-1)) //check both end characters...
                            &&
                    checkPalindrome(a.substring(1,l-1))//call checkPalindrome() by passing except first & last character
                );
    }
}
