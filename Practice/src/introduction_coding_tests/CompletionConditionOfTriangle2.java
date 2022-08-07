package introduction_coding_tests;

public class CompletionConditionOfTriangle2 {
//	삼각형의 완성조건 (2)
	public int solution(int[] sides) {
		return Math.min(sides[0], sides[1]) * 2 - 1;
	}
}