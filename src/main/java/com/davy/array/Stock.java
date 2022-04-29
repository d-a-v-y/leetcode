package com.davy.array;

/**
 * @author Davy
 */
public class Stock {
    public int maxProfit(int[] prices) {

        int len = prices.length;
        int res = 0;
        for(int i = 1;i <len;i++){
            res+=Math.max(0,prices[i]-prices[i-1]);
        }
        return res;
    }
}
