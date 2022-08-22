package introduction_coding_tests;

import java.util.Arrays;

public class CompletionConditionOfTriangle1 {
//	삼각형의 완성조건 (1)
	public int solution(int[] sides) {
		Arrays.sort(sides);
		return sides[0] + sides[1] > sides[2] ? 2 : 1;
	}
}