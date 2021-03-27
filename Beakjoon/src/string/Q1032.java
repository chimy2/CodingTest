package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1032 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String[] answer=br.readLine().split("");
		for(int i=0;i<num-1;i++) {
			String[] arr=br.readLine().split("");
			for(int j=0;j<arr.length;j++) {
				if(!answer[j].equals("?") && !answer[j].equals(arr[j])) {
					answer[j]="?";
				}
			}
		}
		for(String s:answer) {
			System.out.print(s);
		}
	}
}
