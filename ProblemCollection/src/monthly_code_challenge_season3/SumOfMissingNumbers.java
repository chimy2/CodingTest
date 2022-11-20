package monthly_code_challenge_season3;

import java.util.HashSet;
import java.util.Set;

public class SumOfMissingNumbers {
//	없는 숫자 더하기
	public int solution(int[] numbers) {
		int answer = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i : numbers) {
			s.add(i);
		}
		for (int i = 1; i <= 9; i++) {
			if (!s.contains(i))
				answer += i;
		}
		return answer;
//		return 45 - Arrays.stream(numbers).sum();
	}
}