package introduction_coding_tests;

public class MakeAFromB {
//	A로 B 만들기
	public int solution(String before, String after) {
		int[] alpha = new int[26];
		for (int i = 0; i < before.length(); i++) {
			alpha[before.charAt(i) - 'a']++;
			alpha[after.charAt(i) - 'a']--;
		}
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] != 0)
				return 0;
		}
		return 1;
	}
}