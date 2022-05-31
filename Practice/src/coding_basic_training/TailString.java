package coding_basic_training;

import java.util.Arrays;

public class TailString {
//	꼬리 문자열
	public String solution(String[] str_list, String ex) {
		return Arrays.stream(str_list).reduce("", (a, b) -> b.contains(ex) ? a : a + b);
	}
}