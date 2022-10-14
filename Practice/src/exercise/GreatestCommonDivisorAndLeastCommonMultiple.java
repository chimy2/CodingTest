package exercise;

public class GreatestCommonDivisorAndLeastCommonMultiple {
//	최대공약수와 최소공배수
	public int[] solution(int n, int m) {
		int[] answer = { 1, 1 };
		for (int i = 2; i < Math.max(n, m);) {
			if (n % i == 0 && m % i == 0) {
				answer[0] *= i;
				m /= i;
				n /= i;
			} else {
				i++;
			}
		}
		answer[1] = answer[0] * n * m;
		return answer;
//		int[] answer = new int[2];
//
//		answer[0] = gcd(a, b);
//		answer[1] = (a * b) / answer[0];
//		return answer;
	}

//	public static int gcd(int p, int q) {
//		if (q == 0) {
//			return p;
//		}
//		return gcd(q, p % q);
//	}
}
