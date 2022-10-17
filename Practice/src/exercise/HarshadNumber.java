package exercise;

import java.util.Arrays;

public class HarshadNumber {
//	하샤드 수
	public boolean solution(int x) {
		return x % Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum() == 0;
//		char[] a = String.valueOf(x).toCharArray();
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += Integer.parseInt(String.valueOf(a[i]));
//		}
//		return x % sum == 0 ? true : false;
	}
}