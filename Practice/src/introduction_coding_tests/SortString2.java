package introduction_coding_tests;

import java.util.stream.Collectors;

public class SortString2 {
//	문자열 정렬하기 (2)
	public String solution(String my_string) {
		return my_string.toLowerCase().chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
	}
}