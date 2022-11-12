package monthly_code_challenge_season1;

public class ReverseTernary {
//	3진법 뒤집기
	public int solution(int n) {
		StringBuffer s = new StringBuffer();
		s.append(Integer.toString(n, 3));
		s.reverse();
		return Integer.valueOf(s.toString(), 3);
//		int answer = n;
//		int count = 0;
//		String s = "";
//		while (Math.pow(3, count) < n)
//			count++;
//		for (int i = 0; i < count; i++) {
//			s += answer % 3 + "";
//			answer /= 3;
//		}
//		for (int i = 0; i < count; i++) {
//			int j = Character.getNumericValue(s.charAt(i));
//			answer += j * Math.pow(3, count - i - 1);
//		}
//		return answer;
	}
}