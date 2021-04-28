package bf;

import java.io.*;
import java.util.Arrays;

public class Q2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] count=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int l=0, m=1, n=2;
		int answer=arr[l]+arr[m]+arr[n];
		if(answer>count[1]) answer=0;
		while(answer!=arr[1] && l!=count[0]-3) {
			if(m<n-1) {
				n--;
			} else if(m<count[0]-2) {
				m++;
				n=count[0]-1;
			} else {
				l++;
				m=l+1;
				n=count[0]-1;
			}
			int sum=arr[l]+arr[m]+arr[n];
			if(sum<=count[1] && answer<sum) {
				answer=sum;
			}
		}
		System.out.println(answer);
	}
}
