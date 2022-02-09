package sort;

public class HeapSort {

//	힙정렬
//	최대/최소 힙 트리를 구성해 정렬하는 알고리즘
//	시간복잡도 : O(nlogn)
//	공간복잡도 : O(1)
//	제자리 정렬(in-place sorting), 불안정 정렬(unstable sort)
//	장점 : 대용량 데이터를 정렬하는데 유용하다
//	단점 : 최악의 경우 다른 O(nlogn) 알고리즘 보다 느릴 수 있다
//	완전이진트리 : 삽입 시 왼쪽부터 차례대로 추가하는 이진 트리

	public void heapify(int arr[], int n, int i) {
		int p = i;
		int l = i * 2 + 1;
		int r = i * 2 + 2;

		if (l < n && arr[p] < arr[l]) {
			p = l;
		}
		if (r < n && arr[p] < arr[r]) {
			p = r;
		}
		if (i != p) {
			swap(arr, p, i);
			heapify(arr, n, p);
		}
	}

	public void heapSort(int[] arr) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}

	public void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void tryHeapSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			tryHeapify(arr, i);
			swap(arr, 0, i);
		}
	}

	public void tryHeapify(int[] arr, int end) {
		int i = 0;
		boolean checked = false;
		while (i <= end) {
			int l = i * 2 + 1;
			int r = i * 2 + 2;
			checked = true;
			if (l <= end && r <= end && arr[i] < arr[l] && arr[i] < arr[r]) {
				if (arr[l] < arr[r])
					swap(arr, i, r);
				else
					swap(arr, i, l);
			} else if (l <= end && arr[i] < arr[l]) {
				swap(arr, i, l);
			} else if (r <= end && arr[i] < arr[r]) {
				swap(arr, i, r);
			} else {
				checked = false;
				i++;
			}
			if (checked && i > 0)
				i = (i - 1) / 2;
		}
	}
}
