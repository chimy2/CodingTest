package introduction_coding_tests;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
//	문자열 뒤집기
	public String solution(String my_string) {
		return IntStream.range(0, my_string.length()).mapToObj(i -> "" + my_string.charAt(my_string.length() - i - 1))
				.collect(Collectors.joining());
//        return new StringBuilder(my_string).reverse().toString();
	}
}