package sort;

import java.util.Arrays;

public class QuickSort {
	
//	퀵정렬
//	분할 정복 방법으로 정렬
//	기준 원소 피벗(pivot)을 정하고 왼쪽에는 피벗보다 작은 값을 오른쪽에는 큰값이 오도록 나누고(분할)
//	분할된 두 배열을 각각 재귀적으로 과정을 반복한다(정복)
//	시간복잡도 : 최선, 평균 => O(nlogn), 최악 => O(n^2)
//	공간복잡도 : 평균 => O(logn), 최악 => O(n)
//	제자리 정렬(in-place sorting), 불안정 정렬(unstable sort)
//	장점 : 속도가 빠르고 추가 메모리 공간이 필요하지 않다(제자리 정렬)
//	단점 : 정렬된 배열에 경우 불균형 분할로 인해 오히려 비효율적일 수 있다
//	분할 정복 : 문제를 작은 문제로 분할하고 그 작은 문제를 정복하여 문제를 해결하는 알고리즘
	
	public void quickSort(int[] arr, int start, int end) {
		if(start>=end) return;
		int pivot=arr[(start+end)/2];
		int left=start, right=end;
		while(left<=right) {
			while(arr[left]<pivot) left++;
			while(arr[right]>pivot) right--;
			if(left<=right) {
				int temp=arr[left];
				arr[left++]=arr[right];
				arr[right--]=temp;
			}
		}
		quickSort(arr, start, right);
		quickSort(arr, left, end);
	} 
}
