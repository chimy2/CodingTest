package coding_basic_training;

public class CheckIfItIsSuffix {
//	접미사인지 확인하기
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		int len1 = my_string.length();
		int len2 = is_suffix.length();
		if (len1 >= len2 && my_string.substring(len2 - len1).equals(is_suffix)) {
			answer = 1;
		}
		return answer;
//		return my_string.endsWith(is_suffix);
	}
}
