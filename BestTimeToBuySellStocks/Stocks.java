package BestTimeToBuySellStocks;

public class Stocks {
    public int maxProfit(int[] prices) {
        int profits = 0, smallDay = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            smallDay = Math.min(smallDay,prices[i]);
            profits = Math.max(profits,prices[i] - smallDay);
        }
        return profits;
    }
}
