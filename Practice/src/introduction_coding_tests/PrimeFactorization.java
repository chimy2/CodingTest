package introduction_coding_tests;

import java.util.ArrayList;

public class PrimeFactorization {
//	소인수분해
	public int[] solution(int n) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 2; i <= n;) {
			if (n % i == 0) {
				if (!li.isEmpty() && li.indexOf(Integer.valueOf(i)) < 0) {
					li.add(i);
				}
				n /= i;
			} else {
				i++;
			}
		}
		return li.stream().mapToInt(i -> i).toArray();
	}
}