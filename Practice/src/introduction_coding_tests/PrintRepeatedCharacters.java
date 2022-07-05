package introduction_coding_tests;

import java.util.stream.Collectors;

public class PrintRepeatedCharacters {
//	문자 반복 출력하기
	public String solution(String my_string, int n) {
		return my_string.chars().mapToObj(i -> Character.toString(i).repeat(n)).collect(Collectors.joining());
	}
}