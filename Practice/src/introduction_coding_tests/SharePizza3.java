package introduction_coding_tests;

public class SharePizza3 {
//	피자 나눠 먹기 (3)
	public int solution(int slice, int n) {
		return (int) Math.ceil((float) n / slice);
	}
}