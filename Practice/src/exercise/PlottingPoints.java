package exercise;

//	점 찍기
public class PlottingPoints {
	
	public long solution(int k, int d) {
		long answer = 0;

		for (int i = 0; i <= d; i += k) {
			answer += Math.floor(Math.sqrt((long) d * d - (long) i * i)) / k + 1;
		}

		return answer;
	}
}