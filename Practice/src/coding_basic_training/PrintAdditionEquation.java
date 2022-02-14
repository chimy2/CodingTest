package coding_basic_training;

import java.util.Scanner;

public class PrintAdditionEquation {
//	덧셈식 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d + %d = %d", a, b, a + b);
	}
}
