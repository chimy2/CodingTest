package coding_basic_training;

public class CheckIfItIsPrefix {
//	접두사인지 확인하기
	public int solution(String my_string, String is_prefix) {
		return my_string.startsWith(is_prefix) ? 1 : 0;
//		indexOf
//		return my_string.indexOf(is_prefix) == 0 ? 1 : 0;
	}
}