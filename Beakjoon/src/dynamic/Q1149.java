package dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1149 {
//	RGB거리
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr=new int[Integer.parseInt(br.readLine())][3];
		for(int i=0;i<arr.length;i++) {
			String s=br.readLine();
			arr[i][0]=Integer.parseInt(s.split(" ")[0]);
			arr[i][1]=Integer.parseInt(s.split(" ")[1]);
			arr[i][2]=Integer.parseInt(s.split(" ")[2]);
		}
		for(int i=1;i<arr.length;i++) {
			arr[i][0]=Math.min(arr[i-1][1], arr[i-1][2])+arr[i][0];
			arr[i][1]=Math.min(arr[i-1][0], arr[i-1][2])+arr[i][1];
			arr[i][2]=Math.min(arr[i-1][0], arr[i-1][1])+arr[i][2];
		}
		Arrays.sort(arr[arr.length-1]);
		bw.write(arr[arr.length-1][0]+"");
		bw.flush();
		bw.close();
	}
}
