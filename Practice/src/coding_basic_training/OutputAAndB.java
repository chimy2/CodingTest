package coding_basic_training;

import java.util.Scanner;

public class OutputAAndB {
//	A와 B 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("a = %d\nb = %d", a, b);
	}
}
