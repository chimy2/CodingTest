package introduction_coding_tests;

public class ReverseArray {
//	배열 뒤집기
	public int[] solution(int[] num_list) {
		int n = num_list.length;
		for (int i = 0; i <= n / 2; i++) {
			int temp = num_list[i];
			num_list[i] = num_list[n - i - 1];
			num_list[n - i - 1] = temp;
		}
		return num_list;
	}
}