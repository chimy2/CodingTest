package dynamic;

import java.util.Scanner;

public class Q1463 {
//	1로 만들기
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int[] arr=new int[input];
		while(input>1){
			if(input%3 == 0 &&
				!(arr[input/3-1]>0 && arr[input/3-1]<arr[input-1]+1)) {
				arr[input/3-1]=arr[input-1]+1;
			} if(input%2 == 0 &&
				!(arr[input/2-1]>0 && arr[input/2-1]<arr[input-1]+1)) {
				arr[input/2-1]=arr[input-1]+1;
			}
			if(arr[input-2]==0 || 
				arr[input-2]>0 && arr[input-2]>arr[input-1]+1) {
				arr[input-2]=arr[input-1]+1;
			}
			input--;
		}
		System.out.println(arr[0]);
	}
}