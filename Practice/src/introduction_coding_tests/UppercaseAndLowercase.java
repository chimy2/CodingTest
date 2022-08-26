package introduction_coding_tests;

import java.util.stream.Collectors;

public class UppercaseAndLowercase {
//	대문자와 소문자
	public String solution(String my_string) {
		return my_string.chars().mapToObj(i -> Character.toString(i < 97 ? i + 32 : i - 32))
				.collect(Collectors.joining());
	}
}