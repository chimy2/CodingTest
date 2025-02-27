package pcce_past_exam_question;

import java.util.Scanner;

// [PCCE 기출문제] 3번 / 수 나누기
public class DivisionOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int answer = 0;

//        for(int i=0; i<1; i++){
		for (; number > 0;) {
			answer += number % 100;
			number /= 100;
		}

		System.out.println(answer);
	}
}
