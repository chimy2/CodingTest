package coding_basic_training;

public class FindDesiredString {
//	원하는 문자열 찾기
	public int solution(String myString, String pat) {
		return myString.toUpperCase().indexOf(pat.toUpperCase()) >= 0 ? 1 : 0;
	}
}