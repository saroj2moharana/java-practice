package com.skm.algo.dp;

/**
 * @author saroj on 25/10/23
 */
public class KnapSack01 {
    public static void main(String[] args) {
        int n = 2;
        int w = 3;
        int val[] = {1,1};
        int wt[] = {2,1};
        int profit = knapSack(n,w,val,wt);
        System.out.println("Profit would be :"+profit);
    }
    static int knapSack(int N, int W, int val[], int wt[]){
        return solve(N,W,val,wt);
    }

    private static int solve(int n, int w, int[] val, int[] wt) {

        Integer[][] prev = new Integer[w+1][w+1];
        int[] cur = new int[w+1];
        //base case : Initialize for first row...
        for (int i = wt[0]; i<= w; i++){
            if(wt[0]<=w) cur[i] = val[0];
            else cur[i] = 0;
        }

        //take care of remaining recursive calls...
        for(int i=1; i<n; i++){
            for(int j=w; j>=0; j--){
                int include = 0;
                if(wt[i] <= j) include = val[i] + cur[j-wt[i]];
                int exclude = 0 + cur[j];
                cur[j] = Integer.max(include,exclude);
            }
        }
        return cur[w];
    }

}
