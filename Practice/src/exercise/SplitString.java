package exercise;

public class SplitString {
//	문자열 나누기
	public int solution(String s) {
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int count = 1;
			answer++;
			for (int j = i + 1; j < s.length() && count != 0; i = j, j++) {
				if (c != s.charAt(j)) {
					count--;
				} else {
					count++;
				}
			}
		}
		return answer;
//		char prev = '1';
//		int same = 0, different = 0, answer = 0;
//		for (char c : s.toCharArray()) {
//			if (prev == '1') {
//				prev = c;
//				same++;
//				answer++;
//			} else if (prev == c) {
//				same++;
//			} else {
//				different++;
//			}
//
//			if (same == different) {
//				prev = '1';
//				same = 0;
//				different = 0;
//			}
//		}
//		return answer;
	}
}
