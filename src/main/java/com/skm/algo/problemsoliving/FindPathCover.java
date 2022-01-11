package com.skm.algo.problemsoliving;

/**
 * @author saroj on 10/24/2019
 * There is a chess board having nXn squares where a soldier can move either right or upward
 * Soldier will start from left-bottom and ends with right-top.
 * Find out all path covered by soldier?
 */
public class FindPathCover {
    public static void main(String[] args) {
        visitPath(3,0);
    }
    public static boolean visitPath(int up, int right){
        System.out.println("up-"+up+",right-"+right);
        if(up==0 || right==3){
           System.out.println("reached...");
           return true;
        }
        visitPath(--up,right);
        visitPath(up,right++);
        return true;
    }
}
