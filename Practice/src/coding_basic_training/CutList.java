package coding_basic_training;

import java.util.ArrayList;
import java.util.Arrays;

public class CutList {
//	리스트 자르기
	public int[] solution(int n, int[] slicer, int[] num_list) {
		int[] answer = {};
		int a = slicer[0], b = slicer[1], c = slicer[2];
		switch (n) {
		case 1:
			answer = Arrays.copyOfRange(num_list, 0, b + 1);
			break;
		case 2:
			answer = Arrays.copyOfRange(num_list, a, num_list.length);
			break;
		case 3:
			answer = Arrays.copyOfRange(num_list, a, b + 1);
			break;
		case 4:
			ArrayList<Integer> li = new ArrayList<Integer>();
			for (int i = a; i <= b; i += c) {
				li.add(num_list[i]);
			}
			answer = li.stream().mapToInt(i -> i).toArray();
		}
		return answer;
	}
}