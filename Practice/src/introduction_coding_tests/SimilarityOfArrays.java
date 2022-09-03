package introduction_coding_tests;

import java.util.HashSet;
import java.util.Set;

public class SimilarityOfArrays {
//	배열의 유사도
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		Set<String> set = new HashSet<String>();
		for (String s : s1) {
			set.add(s);
		}
		for (String s : s2) {
			if (set.add(s))
				answer++;
		}
		return answer;
	}
}