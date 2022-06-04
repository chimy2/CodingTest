package coding_basic_training;

public class CoffeeErrand {
//	커피 심부름
	public int solution(String[] order) {
		int answer = 0;
		for (String s : order) {
			answer += s.contains("cafelatte") ? 5000 : 4500;
		}
		return answer;
	}
}