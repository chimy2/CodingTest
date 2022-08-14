package introduction_coding_tests;

import java.util.Arrays;

public class SpecialSorting {
//	특이한 정렬
	public int[] solution(int[] numlist, int n) {
		int len = numlist.length, l = -1, r = 0;
		int[] answer = new int[len];
		Arrays.sort(numlist);
		for (int i = 0; i < len && numlist[i] <= n; i++) {
			l = i;
			r = i + 1;
		}
		for (int i = 0; i < len; i++) {
			if (l < 0 || r < len && 2 * n >= numlist[l] + numlist[r]) {
				answer[i] = numlist[r++];
			} else {
				answer[i] = numlist[l--];
			}
		}
		return answer;
	}
}