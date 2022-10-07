package exercise;

public class AddUpDigits {
//	자릿수 더하기
	public int solution(int n) {
		return String.valueOf(n).chars().reduce(0, (ac, c) -> ac + c - 48);
//		char[] a = String.valueOf(n).toCharArray();
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += Integer.parseInt(String.valueOf(a[i]));
//		}
//		return sum;
	}
}