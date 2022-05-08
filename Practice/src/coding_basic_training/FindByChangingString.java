package coding_basic_training;

public class FindByChangingString {
//	문자열 바꿔서 찾기
	public int solution(String myString, String pat) {
		pat = pat.replaceAll("A", "a");
		pat = pat.replaceAll("B", "A");
		pat = pat.replaceAll("a", "B");
		return myString.contains(pat) ? 1 : 0;
	}
}