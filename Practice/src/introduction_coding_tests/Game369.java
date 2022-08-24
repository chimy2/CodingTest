package introduction_coding_tests;

public class Game369 {
//	369게임
	public int solution(int order) {
		return String.valueOf(order).replaceAll("[^369]", "").length();
	}
}