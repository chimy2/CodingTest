package exercise;

public class MakeWeirdCharacters {
//	이상한 문자 만들기
	public String solution(String s) {
		StringBuffer answer = new StringBuffer();
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char s2 = s.charAt(i);
			if (s2 == ' ') {
				answer.append(s2);
				num = 0;
			} else if (num % 2 == 0) {
				answer.append(Character.toUpperCase(s2));
				num++;
			} else {
				answer.append(Character.toLowerCase(s2));
				num++;
			}
		}
		return answer.toString();
	}
}