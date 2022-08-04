package introduction_coding_tests;

public class AddPolynomials {
//	다항식 더하기
	public String solution(String polynomial) {
		String answer = "";
		int x = 0;
		int y = 0;
		for (String s : polynomial.split(" \\+ ")) {
			if (s.charAt(s.length() - 1) == 'x') {
				if (s.length() == 1) {
					x++;
				} else {
					x += Integer.parseInt(s.substring(0, s.length() - 1));
				}
			} else {
				y += Integer.parseInt(s);
			}
		}
		if (x != 0 && y != 0) {
			answer = (x > 1 ? x : "") + "x + " + y;
		} else if (x != 0) {
			answer = (x > 1 ? x : "") + "x";
		} else {
			answer += y;
		}
		return answer;
	}
}