package introduction_coding_tests;

import java.util.Arrays;

public class MakeMaximumValue1 {
//	최댓값 만들기(1)
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];

//        return Arrays.stream(numbers)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .limit(2L)
//                .reduce(1, Math::multiplyExact);
	}
}