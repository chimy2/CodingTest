package introduction_coding_tests;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CharactersThatAppearOnlyOnce {
//	한 번만 등장한 문자
	public String solution(String s) {
		return Arrays.stream(s.split("")).sorted().filter(i -> s.indexOf(i) == s.lastIndexOf(i))
				.collect(Collectors.joining());
	}
}