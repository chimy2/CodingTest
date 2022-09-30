package exercise;

public class BasicStringHandling {
//	문자열 다루기 기본
	public boolean solution(String s) {
		int len = s.length();
		return len == s.replaceAll("\\D", "").length() && (len == 4 || len == 6);
//		return s.matches("\\d{4}|\\d{6}");

//		boolean answer = true;
//		if (s.length() == 4 || s.length() == 6) {
//			for (char a : s.toCharArray()) {
//				if (a < 48 || a > 57) {
//					answer = false;
//					break;
//				}
//			}
//		} else
//			answer = false;
//		return answer;
	}
}