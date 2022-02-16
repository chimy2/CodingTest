package coding_basic_training;

import java.util.Scanner;

public class RotateString {
//	문자열 돌리기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a = a.replace("", "\n");
		System.out.println(a.substring(1, a.length() - 1));
	}
}
