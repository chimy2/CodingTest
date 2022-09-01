package introduction_coding_tests;

public class FindLargestNumber {
//	가장 큰 수 찾기
	public int[] solution(int[] array) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < array.length; i++) {
			if (answer[0] < array[i]) {
				answer[1] = i;
				answer[0] = array[i];
			}
		}
		return answer;
	}
}