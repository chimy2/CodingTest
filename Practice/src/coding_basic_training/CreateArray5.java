package coding_basic_training;

import java.util.ArrayList;

public class CreateArray5 {
//	배열 만들기5
	public int[] solution(String[] intStrs, int k, int s, int l) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < intStrs.length; i++) {
			int temp = Integer.parseInt(intStrs[i].substring(s, s + l));
			if (k < temp)
				li.add(temp);
		}
		return li.stream().mapToInt(i -> i).toArray();
	}
}