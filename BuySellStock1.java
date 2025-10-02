//code is to find out what will be the best day to buy and sell stock 
public class BuySellStock1 {
    public static int maxProfit(int[] prices){
        int totalMaxProfit = 0; int bestBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
              if (prices[i] > bestBuy) {
                  totalMaxProfit = Math.max(totalMaxProfit, prices[i] - bestBuy);
              }
              bestBuy = Math.min(prices[i], bestBuy);
        }
      return totalMaxProfit;
    }
    //main function
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Total max profit made according to the best buy and selling day => " + result);
    }
}
