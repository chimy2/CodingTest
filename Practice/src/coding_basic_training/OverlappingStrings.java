package coding_basic_training;

public class OverlappingStrings {
//	문자열 겹쳐쓰기
	public String solution(String my_string, String overwrite_string, int s) {
		return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
	}
}
