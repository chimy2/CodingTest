package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14888 {
	static int max=-1000000000;
	static int min=1000000000;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		int[] count=new int[4];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) {
			count[i]=Integer.parseInt(st.nextToken());
		}
		
		bf(arr, count, arr[0], 0);
		System.out.println(max+"\n"+min);
	}
	
	private static void bf(int[] arr, int[] count, int result, int index) {
		if(index==arr.length-1) {
			if(max<result) max=result;
			if(min>result) min=result;
		}
		for(int i=0;i<4;i++) {
			if(count[i]>0) {
				count[i]--;
				if(i==0) {
					bf(arr, count, result+arr[index+1], index+1);
				} else if(i==1) {
					bf(arr, count, result-arr[index+1], index+1);
				} else if(i==2) {
					bf(arr, count, result*arr[index+1], index+1);
				} else if(i==3) {
					bf(arr, count, result/arr[index+1], index+1);
				}
				count[i]++;
			}
		}
	}
}
