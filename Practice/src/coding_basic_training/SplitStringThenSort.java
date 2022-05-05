package coding_basic_training;

import java.util.ArrayList;
import java.util.Collections;

public class SplitStringThenSort {
//	문자열 잘라서 정렬하기
	public String[] solution(String myString) {
		ArrayList<String> li = new ArrayList<String>();
		int lastIndex = 0;
		int xIndex = 0;
		while (lastIndex < myString.length()) {
			xIndex = myString.indexOf("x", lastIndex);
			if (lastIndex < xIndex) {
				li.add(myString.substring(lastIndex, xIndex));
				lastIndex = xIndex + 1;
			} else if (xIndex < 0) {
				li.add(myString.substring(lastIndex));
				break;
			} else {
				lastIndex++;
			}
		}
		Collections.sort(li);
		return li.stream().toArray(String[]::new);
	}
}