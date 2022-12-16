package exercise;

public class SmallestSubstringSize {
//	크기가 작은 부분 문자열
	public int solution(String t, String p) {
		int answer = 0;
		for (int i = 0; i < t.length() - p.length(); i++) {
			if (t.substring(i, i + p.length()).compareTo(p) <= 0)
				answer++;
		}
		return answer;
	}
}