package coding_basic_training;

public class ManipulateNumbers2 {
//	수 조작하기2
	public String solution(int[] numLog) {
		String answer = "";
		for (int i = 1; i < numLog.length; i++) {
			switch (numLog[i] - numLog[i - 1]) {
			case 1:
				answer += 'w';
				break;
			case -1:
				answer += 's';
				break;
			case -10:
				answer += 'a';
				break;
			case 10:
				answer += 'd';
			}
		}
		return answer;
	}
}