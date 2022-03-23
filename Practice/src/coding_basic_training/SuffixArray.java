package coding_basic_training;

import java.util.ArrayList;
import java.util.Collections;

public class SuffixArray {
//	접미사 배열
	public String[] solution(String my_string) {
		ArrayList<String> li = new ArrayList<String>();
		for (int i = 0; i < my_string.length(); i++) {
			li.add(my_string.substring(i));
		}
		Collections.sort(li);
		return li.toArray(new String[li.size()]);
//		intstream
//        return IntStream.range(0, myString.length()).mapToObj(myString::substring).sorted().toArray(String[]::new);
	}
}