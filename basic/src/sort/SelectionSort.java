package sort;

public class SelectionSort {

//	선택정렬
//	조건에 맞는 원소를 선택하고(찾고) 정해진 위치로 옮기는(교환하는) 정렬 알고리즘
//	시간복잡도 : O(n^2)
//	공간복잡도 : O(1)
//	제자리 정렬(in-place sorting), 불안정 정렬(unstable sort)
//	장점 : 알고리즘이 단순하여 코드 구현이 쉽다
//		  비교 횟수는 많지만 교환 횟수가 적어 많은 교환이 필요한 자료상태에서 효율적이다
//	단점 : 시간복잡도가 비효율적이며 불안정 정렬이다
//	개선 방법 : 탐색 시 동일한 값이 있다면 함께 정렬,
//			  탐색 시 최솟값과 최댓값을 같이 찾아 탐색횟수를 절반으로 줄일 수 있다(이중 선택 정렬)
//	불안정 정렬(unstable sort) : 중복된 값을 입력순서와 무관하게 정렬

	public void selectionSort(int[] arr) {
		int min = 0, temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
