package coding_basic_training;

public class ReturnValueDependingOnOddOrEven {
//	홀짝에 따라 다른 값 반환하기
	public int solution(int n) {
		int answer = 0;
		for (int i = n; i > 0; i = i - 2) {
			answer += n % 2 == 0 ? i * i : i;
		}
		return answer;
	}
}
