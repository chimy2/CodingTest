package bfs;

import java.io.*;

public class Q7568 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[][] arr=new int[num][2];
		int[] answer=new int[num];
		for(int i=0;i<num;i++) {
			String s=br.readLine();
			arr[i][0]=Integer.parseInt(s.split(" ")[0]);
			arr[i][1]=Integer.parseInt(s.split(" ")[1]);
		}
		for(int i=0;i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[j][0]>arr[i][0] && arr[j][1]>arr[i][1]) answer[i]++;
				if(arr[j][0]<arr[i][0] && arr[j][1]<arr[i][1]) answer[j]++;
				
			}
		}
		for(int i:answer) {
			System.out.printf("%d ", i+1);
		}
	}
}
