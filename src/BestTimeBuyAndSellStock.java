
public class BestTimeBuyAndSellStock {
	public int maxProfit(int[] prices){
		int min = 0;
		int maxDif = 0;
		int buy = 0;
		int sell = 0;
		for (int i = 0; i < prices.length; i++){
			if(prices[min] > prices[i]){
				min = i;
			}
			int dif = prices[i] - prices[min];
			if(dif > maxDif){
				buy = min;
				sell = i;
				maxDif = dif;
			}
		}
		return maxDif;
	}
}
