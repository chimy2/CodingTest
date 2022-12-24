package exercise;

public class PaintOver {
//	덧칠하기
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		for (int i = 0, last = 0; i < section.length; i++) {
			if (last < section[i]) {
				answer++;
				last = section[i] + m - 1;
			}
		}
		return answer;
	}
}