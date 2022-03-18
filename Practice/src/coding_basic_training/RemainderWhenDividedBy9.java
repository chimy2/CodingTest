package coding_basic_training;

public class RemainderWhenDividedBy9 {
//	9로 나눈 나머지
	public int solution(String number) {
		int answer = 0;
		for (char c : number.toCharArray()) {
			answer += c - 48;
		}
		return answer % 9;
//        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
	}
}
