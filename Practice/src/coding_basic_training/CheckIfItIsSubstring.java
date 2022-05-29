package coding_basic_training;

public class CheckIfItIsSubstring {
//	부분 문자열인지 확인하기
	public int solution(String my_string, String target) {
		return my_string.indexOf(target) < 0 ? 0 : 1;
	}
}