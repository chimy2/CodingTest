package coding_basic_training;

import java.util.ArrayList;

public class CountNumberOfOccurrencesBetweenX {
//	x 사이의 개수
	public int[] solution(String myString) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		char[] c = myString.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'x') {
				li.add(count);
				count = 0;
			} else {
				count++;
			}
		}
		li.add(count);
		return li.stream().mapToInt(i -> i).toArray();
//        return Arrays.stream(myString.split("x", myString.length()))
//                .mapToInt(x -> x.length())
//                .toArray();
	}
}