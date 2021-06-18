package stack_queue;

import java.util.Arrays;

public class StockPrice {
	public static void main(String[] args) {
		int[] prices= {1, 2, 3, 2, 3};
		int[] answer=new int[prices.length];
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[i]>prices[j] || j==prices.length-1) {
					answer[i]=j-i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}