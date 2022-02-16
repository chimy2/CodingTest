package coding_basic_training;

import java.util.Scanner;

public class IdentifyOddEven {
//	홀짝 구분하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%d is " + (n % 2 == 0 ? "even" : "odd"), n);
	}
}
