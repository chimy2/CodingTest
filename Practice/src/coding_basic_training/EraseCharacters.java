package coding_basic_training;

public class EraseCharacters {
//	글자 지우기
	public String solution(String my_string, int[] indices) {
		String answer = "";
		String[] s = my_string.split("");
		for (int i : indices) {
			s[i] = "";
		}
		for (int i = 0; i < s.length; i++) {
			answer += s[i];
		}
//		Arrays.sort(indices);
//		for (int i = 0, j = 0; i < my_string.length(); i++) {
//			if (j >= indices.length || i < indices[j]) {
//				answer += my_string.charAt(i);
//			} else {
//				j++;
//			}
//		}
		return answer;
	}
}