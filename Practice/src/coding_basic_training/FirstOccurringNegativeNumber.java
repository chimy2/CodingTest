package coding_basic_training;

public class FirstOccurringNegativeNumber {
//	첫 번째로 나오는 음수
	public int solution(int[] num_list) {
		int answer = -1;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
