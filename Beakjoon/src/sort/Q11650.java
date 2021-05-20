package sort;

import java.io.*;
import java.util.Arrays;

public class Q11650 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[][] arr=new int[num][2];
		for(int i=0;i<num;i++) {
			arr[i]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		mergeSort(arr, 0, arr.length-1);
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
	}

	private static void mergeSort(int[][] arr, int start, int end) {
//	if(start!=end) {
		if(start==end) return;
		int mid=(start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid, end);
		System.out.printf("start=%d, mid=%d, end=%d\n", start,mid,end);
//			sort(arr, start, end);
//			sort(arr, start, mid, end);
//	}
	}

	private static void sort(int[][] arr, int start, int end) {
		// TODO Auto-generated method stub
		System.out.printf("%d, %d", start, end);
	}

//	private static void sort(int[][] arr, int start, int mid, int end) {
//		int[][] temp=new int[end-start+1][2];
//		int l=start, r=mid+1, index=0;
//		System.out.println(l+", "+r);
//		while(l<=mid||r<=end) {
//			if(r>end || arr[l][0]<arr[r][0]
//					|| arr[l][0]==arr[r][0] && arr[l][1]<arr[r][1]) {
//				System.out.println("1번");
//				temp[index++]=arr[l++];
//			} else {
//				System.out.println("2번");
//				temp[index++]=arr[r++];
//			}
//		}
//		
//		while(l<mid) {
//			temp[index++]=arr[l++];
//		}
//		
//		while(r<end) {
//			temp[index++]=arr[r++];
//		}
//		
//		for(int i=start;i<=end;i++) {
//			arr[i]=temp[i];
//		}
//	}
}
