package introduction_coding_tests;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Decryption {
//	암호 해독
	public String solution(String cipher, int code) {
		return IntStream.rangeClosed(1, cipher.length() / code)
				.mapToObj(i -> String.valueOf(cipher.charAt(i * code - 1))).collect(Collectors.joining());
	}
}