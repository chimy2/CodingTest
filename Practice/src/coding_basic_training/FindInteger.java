package coding_basic_training;

import java.util.Arrays;

public class FindInteger {
//	정수 찾기
	public int solution(int[] num_list, int n) {
		return Arrays.stream(num_list).filter(i -> i == n).count() > 0 ? 1 : 0;
//        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
	}
}