package introduction_coding_tests;

import java.util.Arrays;

public class SumOfHiddenNumbers2 {
//	숨어있는 숫자의 덧셈 (2)
	public int solution(String my_string) {
		return Arrays.stream(my_string.replaceAll("\\D+", " ").split(" ")).filter(i -> !i.equals(""))
				.mapToInt(Integer::parseInt).sum();
//        return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
	}
}