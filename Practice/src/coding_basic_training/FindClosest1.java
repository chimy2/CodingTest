package coding_basic_training;

public class FindClosest1 {
//	가까운 1 찾기
	public int solution(int[] arr, int idx) {
		int answer = -1;
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}