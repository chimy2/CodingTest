package introduction_coding_tests;

public class SumOfHiddenNumbers1 {
//	숨어있는 숫자의 덧셈 (1)
	public int solution(String my_string) {
		return my_string.replaceAll("[^\\d]", "").chars().reduce(0, (i, j) -> i + j - 48);
	}
}