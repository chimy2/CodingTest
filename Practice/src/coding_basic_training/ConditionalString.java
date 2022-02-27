package coding_basic_training;

public class ConditionalString {
//	조건 문자열
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		boolean checked1 = ineq.equals(">");
		boolean checked2 = eq.equals("=");
		if ((checked1 && n >= m) || (!checked1 && n <= m)) {
			if (checked2 || n != m) {
				answer = 1;
			}
		}
		return answer;
	}
}
