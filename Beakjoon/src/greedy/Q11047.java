package greedy;

import java.util.Scanner;

public class Q11047 {
//	동전 0
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		int goal=sc.nextInt();
		int index=arr.length-1;
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		while(goal!=0) {
			if(arr[index]>goal) {
				index--;
				continue;
			}
//			빼기
//			goal-=arr[index];
//			answer++;
			
//			나누기
			answer+=goal/arr[index];
			goal%=arr[index];
		}
		System.out.println(answer);
	}
}
