package coding_basic_training;

import java.util.Scanner;

public class PrintTextWithChangedCase {
//	대소문자 바꿔서 출력하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";
		for (char c : a.toCharArray()) {
			b += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
		}
		System.out.println(b);
	}
}
