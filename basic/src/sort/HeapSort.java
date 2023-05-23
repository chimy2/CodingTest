package sort;

public class HeapSort {

//	������
//	�ִ�/�ּ� �� Ʈ���� ������ �����ϴ� �˰���
//	�ð����⵵ : O(nlogn)
//	�������⵵ : O(1)
//	���ڸ� ����(in-place sorting), �Ҿ��� ����(unstable sort)
//	���� : ��뷮 �����͸� �����ϴµ� �����ϴ�
//	���� : �־��� ��� �ٸ� O(nlogn) �˰��� ���� ���� �� �ִ�
//	��������Ʈ�� : ���� �� ���ʺ��� ���ʴ�� �߰��ϴ� ���� Ʈ��

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
