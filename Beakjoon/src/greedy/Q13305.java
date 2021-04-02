package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13305 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int index=0;
		long answer=0;
		int[] prevLen=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] prevCost=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for(int i=0;i<n-1;i++) {
			if(i==0 || prevCost[index]>=prevCost[i]) {
				answer+=(long)prevLen[i]*prevCost[i];
				index=i;
			} else {
				answer+=(long)prevLen[i]*prevCost[index];
			}
		}
		System.out.println(answer);
	}
}
