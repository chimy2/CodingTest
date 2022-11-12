package monthly_code_challenge_season1;

import java.util.Set;
import java.util.TreeSet;

public class SumOfTwoNumbers {
//	두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		return set.stream().mapToInt(i -> i).toArray();
//		HashSet<Integer> hs = new HashSet<Integer>();
//		int i = 0;
//		for (; i < numbers.length; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				hs.add(numbers[i] + numbers[j]);
//			}
//		}
//		int[] answer = new int[hs.toArray().length];
//		i = 0;
//		for (Object x : hs.toArray()) {
//			answer[i++] = (int) x;
//		}
//		Arrays.sort(answer);
//		return answer;
	}
}