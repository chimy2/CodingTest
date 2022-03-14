package coding_basic_training;

import java.util.ArrayList;

public class CreateCollatzSequence {
//	콜라츠 수열 만들기
	public int[] solution(int n) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(n);
		while (n != 1) {
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
			li.add(n);
		}
		return li.stream().mapToInt(i -> i).toArray();
//		intstream을 이용한 방법
//        return IntStream.concat(
//                        IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1),
//                        IntStream.of(1))
//                .toArray();
	}
}