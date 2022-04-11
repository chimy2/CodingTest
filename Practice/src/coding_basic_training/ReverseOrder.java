package coding_basic_training;

public class ReverseOrder {
//	순서 바꾸기
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[(i + n) % answer.length];
		}
		return answer;
	}
}