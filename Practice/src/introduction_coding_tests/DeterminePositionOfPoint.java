package introduction_coding_tests;

public class DeterminePositionOfPoint {
//	점의 위치 구하기
	public int solution(int[] dot) {
		int answer = 4;
		if (dot[0] > 0 && dot[1] > 0) {
			answer = 1;
		} else if (dot[0] < 0 && dot[1] < 0) {
			answer = 3;
		} else if (dot[0] < 0 && dot[1] > 0) {
			answer = 2;
		}
		return answer;
	}
}