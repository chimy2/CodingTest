package exercise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindKimInSeoul {
//	서울에서 김서방 찾기
	public String solution(String[] seoul) {
		return IntStream.range(0, seoul.length).mapToObj(i -> seoul[i].equals("Kim") ? "김서방은 " + i + "에 있다" : "")
				.collect(Collectors.joining());
//		int answer = 0;
//		for (int i = 0; i < seoul.length; i++) {
//			if (seoul[i].equals("Kim")) {
//				answer = i;
//				break;
//			}
//		}
//		return "김서방은 " + answer + "에 있다";
	}
}