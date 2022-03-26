package coding_basic_training;

public class FirstNCharactersOfString {
//	문자열의 앞의 n글자
	public String solution(String my_string, int n) {
		return my_string.substring(0, n);
	}
}