package sort;

public class BubbleSort {

//	거품정렬
//	서로 인접한 두 원소의 대소를 비교하고 조건에 맞지 않다면 자리를 교환하여 정렬하는 알고리즘
//	시간복잡도 : O(n^2) <= n(n-1)/2 
//	공간복잡도 : O(1)
//	제자리 정렬(in-place sorting), 안정 정렬(stable sort)
//	장점 : 구현이 간단하고 직관적이며 다른 메모리 공간을 필요로 하지 않는다(제자리 정렬)
//        중복된 값을 입력 순서와 동일하게 유지하여 정렬한다(안정 정렬)
//	단점 : 굉장히 비효율적이며 정렬되어 있지 않은 배열의 경우 교환연산이 많이 일어나게 된다
//	알고리즘 : 수학, 컴퓨터과학 등에서 문제를 해결하기 위해 정해진 일련의 절차
//	제자리 정렬(in-place sorting) : 정렬하고자 하는 배열안에서 교환하는 정렬
//	안정 정렬(stable sort) : 중복된 값을 입력 순서와 동일하게 정렬
//	공간복잡도의 O(1) : 배열의 크기(n)가 커짐과 상관없이 고정 공간만을 사용

	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
