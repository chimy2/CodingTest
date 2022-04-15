package coding_basic_training;

import java.util.stream.IntStream;

public class InGroupsOf5 {
//	5명씩
	public String[] solution(String[] names) {
		return IntStream.rangeClosed(0, (names.length - 1) / 5).mapToObj(i -> names[i * 5]).toArray(String[]::new);
	}
}