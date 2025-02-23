package pcce_past_exam_question;

import java.util.Scanner;

// [PCCE 기출문제] 2번 / 피타고라스의 정리
public class PythagoreanTheorem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();

		int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));

		System.out.println(b_square);
	}
}