package sort;

public class InsertionSort {
	
//	삽입정렬
//	2번째 원소부터 정렬된 부분과 비교하여 차례대로 위치를 찾아 삽입하여 정렬하는 알고리즘
//	시간복잡도 : 최선 => O(n), 최악, 평균 => O(n^2)
//	공간복잡도 : O(1)
//	제자리 정렬(in-place sorting), 안정 정렬(stable sort)
//	장점 : 알고리즘이 단순하며 대부분의 원소가 정렬됐거나 배열의 길이가 짧다면 효율적이다
//	단점 : 평균, 최악 시간복잡도가 비효율적이며 배열의 길이가 길어질수록 비효율적이다
	
//	처음버전
	public void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]>arr[j-1]) {
					break;
				}
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
	
//	개선버전
	public void insertionSort2(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
