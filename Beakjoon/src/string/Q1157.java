package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().toUpperCase();
		int[] arr=new int[26];
		int max=0;
		int answer=0;
		boolean check=false;
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-65]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				answer=i;
				check=false;
			} else if(max==arr[i]){
				check=true;
			}
		}
		System.out.println(check?'?':(char)(answer+65));
	}
}
