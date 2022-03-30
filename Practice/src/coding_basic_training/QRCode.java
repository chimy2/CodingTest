package coding_basic_training;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QRCode {
//	qr code
	public String solution(int q, int r, String code) {
		return IntStream.range(0, code.length()).mapToObj(i -> i % q == r ? String.valueOf(code.charAt(i)) : "")
				.collect(Collectors.joining());

	}
}