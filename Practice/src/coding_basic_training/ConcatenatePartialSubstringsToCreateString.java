package coding_basic_training;

public class ConcatenatePartialSubstringsToCreateString {
//	부분 문자열 이어 붙여 문자열 만들기
	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		for (int i = 0; i < parts.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
		return answer;
	}
}