package exercise;

public class OurUniquePassword {
//	둘만의 암호
	public String solution(String s, String skip, int index) {
		StringBuilder answer = new StringBuilder();
		char[] c = new char[26];
		int temp = 0;
		for (int i = 0; i < 26; i++) {
			for (int count = 1, minus = 0; count - minus <= index; count++) {
				temp = (i + count) % 26 + 97;
				if (skip.indexOf(temp) > -1) {
					minus++;
				}
			}
			c[i] = (char) temp;
		}
		for (int i = 0; i < s.length(); i++) {
			answer.append(c[s.charAt(i) - 97]);
		}
		return answer.toString();
	}
}