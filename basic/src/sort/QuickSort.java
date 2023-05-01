package sort;

import java.util.Arrays;

public class QuickSort {
	
//	������
//	���� ���� ������� ����
//	���� ���� �ǹ�(pivot)�� ���ϰ� ���ʿ��� �ǹ����� ���� ���� �����ʿ��� ū���� ������ ������(����)
//	���ҵ� �� �迭�� ���� ��������� ������ �ݺ��Ѵ�(����)
//	�ð����⵵ : �ּ�, ��� => O(nlogn), �־� => O(n^2)
//	�������⵵ : ��� => O(logn), �־� => O(n)
//	���ڸ� ����(in-place sorting), �Ҿ��� ����(unstable sort)
//	���� : �ӵ��� ������ �߰� �޸� ������ �ʿ����� �ʴ�(���ڸ� ����)
//	���� : ���ĵ� �迭�� ��� �ұ��� ���ҷ� ���� ������ ��ȿ������ �� �ִ�
//	���� ���� : ������ ���� ������ �����ϰ� �� ���� ������ �����Ͽ� ������ �ذ��ϴ� �˰���
	
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
