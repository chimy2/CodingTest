package coding_basic_training;

import java.util.Arrays;

public class SumOfStringIntegers {
//	문자열 정수의 합
	public int solution(String num_str) {
		int answer = 0;
		return Arrays.stream(num_str.split("")).mapToInt(i -> Integer.parseInt(i)).sum();
//        return numStr.chars().map(c -> c - 48).sum();
	}
}