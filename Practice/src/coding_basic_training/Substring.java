package coding_basic_training;

public class Substring {
//	부분 문자열
	public int solution(String str1, String str2) {
		return str2.contains(str1) ? 1 : 0;
	}
}