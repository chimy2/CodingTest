package coding_basic_training;

public class EmphasizeLetterA {
//	A 강조하기
	public String solution(String myString) {
		String answer = "";
		for (char c : myString.toCharArray()) {
			if (c == 'A') {
				answer += c;
			} else if (c == 'a') {
				answer += Character.toUpperCase(c);
			} else {
				answer += Character.toLowerCase(c);
			}
		}
		return answer;
	}
}