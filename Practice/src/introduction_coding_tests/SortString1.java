package introduction_coding_tests;

public class SortString1 {
//	문자열 정렬하기 (1)
	public int[] solution(String my_string) {
		int[] answer = {};
		return my_string.chars().filter(i -> i <= '9').map(i -> i - 48).sorted().toArray();
	}
}