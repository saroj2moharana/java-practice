package com.skm.algo.problemsoliving;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saroj on 7/28/2020
 */
public class StockProfit {
    public static void main(String[] args) {
        //int stocks[] = {100,180,260,310,40,535,695};
        int stocks[] = {822,754,1689,305,214,782,1463,1432,1382,1734,948,231,210,1676,877,670,1384,725,1370,412,724,371,928,358,533,1031,850,1555,1064,845,1692,514,630,1333,1640,315,1639,1792,1779,1325,1619,1400,378,145,913,901,1652,530,1259,880,303,685,1586};
        ArrayList<ArrayList<Integer>> ans = stockBuySell(stocks,stocks.length);
        System.out.println(ans);
    }
    static ArrayList<ArrayList<Integer>> stockBuySell(int a[], int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            Integer start = 0;
            Integer end = 0;
            while (i<n && a[i]<a[i-1]) i++;
            start = i-1;
            while(i<n && a[i]>=a[i-1]) i++;
            end = i-1;
            if(start<end){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);//Arrays.asList(start,end);
                list.add(temp);
            }
        }
        return list;
    }
}
