package com.skm.algo.array;

/**
 * @author saroj on 8/2/2020
 */
public class MaxTwoElementProduct {
    private static void calculateProduct(int a[]){
        int positiveMax1=Integer.MIN_VALUE;
        int positiveMax2 = Integer.MIN_VALUE;
        int negativeMin1 = 0;
        int negativeMin2 = 0;

        //int i=0, j=a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>positiveMax1) {
                positiveMax2 = positiveMax1;
                positiveMax1 = a[i];
            }
            if(a[i]>positiveMax2 && positiveMax1!=a[i])
                positiveMax2 = a[i];
            if(a[i]<0){
                if(a[i]<negativeMin1) {
                    negativeMin2 = negativeMin1;
                    negativeMin1 = a[i];
                }
                if(a[i]<negativeMin2 && negativeMin1 != a[i])
                    negativeMin2 = a[i];
            }
        }
        int positiveProd = positiveMax1 * positiveMax2;
        int negativeProd = negativeMin1 * negativeMin2;
        System.out.println(positiveMax1+"-"+positiveMax2);
        System.out.println(negativeMin1+"-"+negativeMin2);
        if(positiveProd>negativeProd)
            System.out.println("Max Product of : "+positiveMax1+","+positiveMax2+":"+positiveMax1*positiveMax2);
        else{
            System.out.println("Max Product of : "+negativeMin1+","+negativeMin2+":"+negativeMin1*negativeMin2);
        }
    }
    public static void main(String[] args) {
        int a[] = {-7,2,3,1,5,-8,};
        calculateProduct(a);
    }
}
