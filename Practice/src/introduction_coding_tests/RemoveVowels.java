package introduction_coding_tests;

public class RemoveVowels {
//	모음 제거
	public String solution(String my_string) {
		String answer = "";
		return my_string.replace("[aeiou]", "");
	}
}