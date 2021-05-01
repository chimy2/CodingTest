package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10819 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int[] arr=new int[num];
		int max=0;
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		do {
			max=Math.max(max, getResult(arr));
		} while(permutate(arr));
		System.out.println(max);
	}
	
	private static int getResult(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			sum+=Math.abs(arr[i]-arr[i+1]);
		}
		return sum;
	}
	
	private static boolean permutate(int[] arr) {
		int i=arr.length-1;
		int j=arr.length-1;
		while(i>0 && arr[i-1]>=arr[i]) i--;
		if(i<=0) return false;
		while(arr[i-1]>=arr[j]) j--;
		swap(arr, i-1, j);
		j=arr.length-1;
		while(i<j) {
			swap(arr, i++, j--);
		}
		return true;
	}
	
	private static void swap(int[] arr, int i, int j) { 
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
