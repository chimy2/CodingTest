package coding_basic_training;

public class CountNumberOfCharacters {
//	문자 개수 세기
	public int[] solution(String my_string) {
		int[] answer = new int[52];
		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (Character.isUpperCase(c)) {
				answer[c - 65]++;
			} else {
				answer[c - 71]++;
			}
		}
//		for (char ch : my_string.toCharArray()) {
//			answer[ch - 'A' - (Character.isLowerCase(ch) ? 6 : 0)]++;
//		}
		return answer;
	}
}