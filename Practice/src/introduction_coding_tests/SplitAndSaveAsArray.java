package introduction_coding_tests;

import java.util.stream.IntStream;

public class SplitAndSaveAsArray {
//	잘라서 배열로 저장하기
	public String[] solution(String my_str, int n) {
		String[] answer = new String[(my_str.length() + 5) / 6];
		IntStream.range(0, my_str.length()).forEach(i -> answer[(i - 1) / 6] += Character.valueOf(my_str.charAt(i)));
		return answer;
	}
}