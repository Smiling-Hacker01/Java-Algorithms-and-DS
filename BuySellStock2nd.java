//code is to produce a maxximum profit if we can buy and sell a stock multiple time but the thing is we can only hold one share at a time.
//the key to solve this ques is that we buy and sell stock every single day if profit made then add to total profit other wise move
public class BuySellStock2nd {
    public static int maxProfit(int[] prices){
        int totalProfit = 0;
        int bestBuy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if (bestBuy < prices[i]) {
                totalProfit += prices[i] - bestBuy;
            }
            bestBuy = prices[i];
        }
        return totalProfit;
    }
    //main function
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        int totalProfit = maxProfit(prices);
        System.out.println("Total profit we can made if we buy and sell stock multiple times is => " + totalProfit);
    }
}
