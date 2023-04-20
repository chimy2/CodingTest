package sort;

public class BubbleSort {
//	��ǰ����
//	���� ������ �� ������ ��Ҹ� ���ϰ� ���ǿ� ���� �ʴٸ� �ڸ��� ��ȯ�Ͽ� �����ϴ� �˰���
//	�ð����⵵ = n(n-1)/2 => O(n^2)
//	�������⵵ = O(n)
//	���ڸ� ����(in-place sorting), ���� ����(stable sort)
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
