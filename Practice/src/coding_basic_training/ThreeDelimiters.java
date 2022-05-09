package coding_basic_training;

import java.util.ArrayList;

public class ThreeDelimiters {
//	세 개의 구분자
	public String[] solution(String myStr) {
		ArrayList<String> li = new ArrayList<String>();
		int l = 0;
		int r = 0;
		while (r < myStr.length()) {
			char c = myStr.charAt(r);
			if (c == 'a' || c == 'b' || c == 'c') {
				if (l < r) {
					li.add(myStr.substring(l, r));
				}
				l = r + 1;
			}
			r++;
		}
		if (l < r) {
			li.add(myStr.substring(l, r));
		}
		return li.size() > 0 ? li.toArray(String[]::new) : new String[] { "EMPTY" };
	}
}