package coding_basic_training;

public class CommonMultiples {
//	공배수
	public int solution(int number, int n, int m) {
		return number % n == 0 && number % m == 0 ? 1 : 0;
	}
}
