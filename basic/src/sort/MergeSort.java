package sort;

import java.util.Arrays;

public class MergeSort {

//	�պ�����
//	���� ���� ������� ����
//	�����İ� �޸� ��� ���Ҹ� �ɰ� ��(����) ��ġ�鼭 ����(����)�ذ��� �˰���
//	�ð����⵵ : O(nlogn)
//	�������⵵ : ��(n)
//	���� ����(stable sort)
//	���� : ���Ḯ��Ʈ ���� �� ȿ�����̴�
//	���� : �պ��� ���� �߰� �޸� ������ �ʿ��ϴ�
//	�����İ� �պ������� ���Ĺ�� ����
//	������ : �ǹ��� �������� ���� ���� ū ���� ������ �����ϰ� �� �κ��� �����ϴ� ������ �ݺ���
//	�պ����� : ���ݾ� ���� �����ϰ� ���κ��� ��ġ�鼭 ������ ��
	
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
