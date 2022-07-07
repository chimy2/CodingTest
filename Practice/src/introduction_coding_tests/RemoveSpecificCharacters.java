package introduction_coding_tests;

public class RemoveSpecificCharacters {
//	특정 문자 제거하기
	public String solution(String my_string, String letter) {
		return my_string.replaceAll(letter, "");
	}
}