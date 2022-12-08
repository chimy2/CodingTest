package exercise;

import java.util.regex.Pattern;

public class Babbling2 {
//	옹알이 (2)
	public int solution(String[] babbling) {
		int answer = 0;
		Pattern p = Pattern.compile("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$");
		for (String s : babbling) {
			if (p.matcher(s).matches()) {
				answer++;
			}
		}
		return answer;
	}
}