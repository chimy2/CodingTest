package introduction_coding_tests;

public class StringwithinString {
//	문자열안에 문자열
	public int solution(String str1, String str2) {
		return str1.contains(str2) ? 1 : 2;
	}
}