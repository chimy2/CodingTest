package coding_basic_training;

public class CompareResultsOfTwoNumbers {
//	두 수의 연산값 비교하기
	public int solution(int a, int b) {
		return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
// 		return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
	}
}
