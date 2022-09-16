package introduction_coding_tests;

public class NextNumber {
//	다음에 올 숫자
	public int solution(int[] common) {
		int x = common[0], y = common[1], z = common[2], len = common.length;
		return y - x == z - y ? x + (z - y) * len : x * (int) Math.pow((z / y), len);
	}
}