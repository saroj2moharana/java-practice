package com.skm.algo.array;

/**
 * @author saroj on 21/10/23
 */
public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,7};
        int b[] = {2,4};
        float n = new MedianOfTwoSortedArray().findMedian(a,b);
        System.out.println("Median : "+n);
    }

    /**
     * This is for finding median of two sorted arrays...
     * @param a
     * @param b
     * @return
     */
    private float findMedian(int[] a, int[] b) {
        int l1 = a.length;
        int l2 = b.length;
        if(l1 == 0 || l2 == 0) return -1;
        int i1 = 0;
        int i2 = 0;
        int mi = 0;
        int c[] = new int[l1+l2];
        while(i1<l1 && i2<l2){
            if(a[i1]<b[i2]){
                c[mi++] = a[i1++];
            }else if(a[i1] >= b[i2]){
                c[mi++] = b[i2++];
            }
        }
        //System.out.println("i1:"+i1+",i2:"+i2);
        while(i1<l1){
            c[mi++] = a[i1++];
        }
        while(i2<l2){
            c[mi++] = b[i2++];
        }
        int l = l1+l2;
        if(l%2 == 0){
            int m = l/2;
            return (float)(c[m-1]+c[m])/2;
        }else return c[l/2];
    }
}
