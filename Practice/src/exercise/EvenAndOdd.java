package exercise;

public class EvenAndOdd {
//	짝수와 홀수
	public String solution(int num) {
		return num % 2 != 0 ? "Odd" : "Even";
//		return (num & 1) == 0 ? "Even" : "Odd";
	}
}