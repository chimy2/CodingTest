package stack_queue;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StockPrice {
	public static void main(String[] args) {
		int[] prices= {1, 2, 3, 2, 3};
		int[] answer=new int[prices.length];
		Stack<int[]> st=new Stack<int[]>();
		for(int i=0;i<prices.length;i++) {
			System.out.println(i);
			if(st.isEmpty() || st.peek()[1]<=prices[i]) {
				st.add(new int[] {i, prices[i]});
			}else {
				for(int j=st.size()-1;j>=0;j--) {
					if(st.get(j)[1]<=prices[i]) break;
					int num=st.pop()[0];
					answer[num]=i-num;
				}
			}
			for(int[] arr:st) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(answer));
			System.out.println();
		}
		for(int i=0;i<st.size();i++) {
			answer[st.get(i)[0]]=st.size()-st.get(i)[0]-1;
		}
		System.out.println("여기"+st.size());
		System.out.println("끝="+Arrays.toString(answer));
	}
}
