package coding_basic_training;

import java.util.ArrayList;

public class DeleteElementsInArray {
//	배열의 원소 삭제하기
	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> delete = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i : arr) {
			answer.add(i);
		}
		for (int i : delete_list) {
			delete.add(i);
		}
		for (int i = 0; i < answer.size(); i++) {
			if (delete.contains(answer.get(i))) {
				answer.remove(answer.get(i--));
			}
		}
		return answer.stream().mapToInt(i -> i).toArray();
	}
}