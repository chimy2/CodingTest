package sort;

public class InsertionSort {
	
//	��������
//	2��° ���Һ��� ���ĵ� �κа� ���Ͽ� ���ʴ�� ��ġ�� ã�� �����Ͽ� �����ϴ� �˰���
//	�ð����⵵ : �ּ� => O(n), �־�, ��� => O(n^2)
//	�������⵵ : O(1)
//	���ڸ� ����(in-place sorting), ���� ����(stable sort)
//	���� : �˰����� �ܼ��ϸ� ��κ��� ���Ұ� ���ĵưų� �迭�� ���̰� ª�ٸ� ȿ�����̴�
//	���� : ���, �־� �ð����⵵�� ��ȿ�����̸� �迭�� ���̰� ��������� ��ȿ�����̴�
	
//	ó������
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
	
//	��������
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
