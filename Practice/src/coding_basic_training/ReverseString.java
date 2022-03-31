package coding_basic_training;

public class ReverseString {
//	문자열 뒤집기
	public String solution(String my_string, int s, int e) {
		char[] c = my_string.toCharArray();
		for (int i = s; i <= s + (e - s) / 2; i++) {
			char temp = c[i];
			c[i] = c[e - i + s];
			c[e - i + s] = temp;
		}
		return new String(c);
	}
}