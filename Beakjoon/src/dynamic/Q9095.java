package dynamic;

import java.util.Scanner;

public class Q9095 {
//	1, 2, 3 더하기
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] input=new int[sc.nextInt()];
		int[] arr=new int[10];
		for(int i=0;i<input.length;i++) {
			input[i]=sc.nextInt();
		}
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		for(int i=3;i<arr.length;i++) {
			arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
		}
		for(int i:input) {
			System.out.println(arr[i-1]);
		}
	}
}
