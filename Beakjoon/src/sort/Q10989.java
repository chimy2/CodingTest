package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[10000];
		int num=Integer.parseInt(br.readLine());
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<num;i++) {
			arr[Integer.parseInt(br.readLine())-1]++;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				sb.append(i+1+"\n");
			}
		}
		System.out.println(sb);
	}
}
