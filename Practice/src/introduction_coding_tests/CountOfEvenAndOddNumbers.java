package introduction_coding_tests;

public class CountOfEvenAndOddNumbers {
//	짝수 홀수 개수
	public int[] solution(int[] num_list) {
		int[] answer = { 0, 0 };
		for (int i = 0; i < num_list.length; i++) {
			answer[num_list[i] % 2]++;
		}
		return answer;
	}
}