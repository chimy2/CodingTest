package sort;

public class BubbleSort {
//	거품정렬
//	서로 인접한 두 원소의 대소를 비교하고 조건에 맞지 않다면 자리를 교환하여 정렬하는 알고리즘
//	시간복잡도 = n(n-1)/2 => O(n^2)
//	공간복잡도 = O(n)
//	제자리 정렬(in-place sorting), 안정 정렬(stable sort)
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
