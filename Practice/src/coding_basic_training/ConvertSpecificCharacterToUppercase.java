package coding_basic_training;

public class ConvertSpecificCharacterToUppercase {
//	특정한 문자를 대문자로 바꾸기
	public String solution(String my_string, String alp) {
		return my_string.replaceAll(alp, alp.toUpperCase());
	}
}