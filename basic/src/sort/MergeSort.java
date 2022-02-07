package sort;

import java.util.Arrays;

public class MergeSort {

//	합병정렬
//	분할 정복 방법으로 정렬
//	퀵정렬과 달리 모든 원소를 쪼갠 뒤(분할) 합치면서 정렬(정복)해가는 알고리즘
//	시간복잡도 : O(nlogn)
//	공간복잡도 : О(n)
//	안정 정렬(stable sort)
//	장점 : 연결리스트 정렬 시 효율적이다
//	단점 : 합병을 위한 추가 메모리 공간이 필요하다
//	퀵정렬과 합병정렬의 정렬방식 차이
//	퀵정렬 : 피벗을 기준으로 작은 값과 큰 값을 나누어 분할하고 각 부분을 정렬하는 과정을 반복함
//	합병정렬 : 절반씩 나눠 분할하고 각부분을 합치면서 정렬이 됨
	
	public void mergeSort(int[] arr, int[] temp, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			merge(arr, temp, start, mid, end);
		}
	}
	
	public void merge(int[] arr, int[] temp, int start, int mid, int end) {
		int index=start, left=start, right=mid+1;
		for(int i=start;i<=end;i++) temp[i]=arr[i];
		while(left<=mid && right<=end) {
			if(temp[left]<=temp[right]) {
				arr[index++]=temp[left++];
			} else {
				arr[index++]=temp[right++];
			}
		}
		for(int i=0;i<=mid-left;i++) {
			arr[index+i]=temp[left+i];
		}
	}
}
