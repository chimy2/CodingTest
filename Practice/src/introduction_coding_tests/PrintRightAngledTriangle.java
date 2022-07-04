package introduction_coding_tests;

import java.util.Scanner;

public class PrintRightAngledTriangle {
//	직각삼각형 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			s.append("*".repeat(i) + "\n");
		}
		System.out.println(s);
	}
}