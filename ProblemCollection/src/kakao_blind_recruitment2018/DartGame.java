package kakao_blind_recruitment2018;

import java.util.Arrays;

public class DartGame {
//	다트 게임
	public int solution(String dartResult) {
		int[] answer = Arrays.stream(dartResult.split("[^\\d]+")).mapToInt(Integer::parseInt).toArray();
		String[] bonus = Arrays.stream(dartResult.split("\\d+")).skip(1).toArray(String[]::new);
		for (int i = 0; i < bonus.length; i++) {
			switch (bonus[i].charAt(0)) {
			case 'D':
				answer[i] *= answer[i];
				break;
			case 'T':
				answer[i] = (int) Math.pow(answer[i], 3);
			}
			if (bonus[i].length() > 1) {
				switch (bonus[i].charAt(1)) {
				case '*':
					answer[i] *= 2;
					if (i > 0) {
						answer[i - 1] *= 2;
					}
					break;
				case '#':
					answer[i] *= -1;
				}
			}
		}
		return answer[0] + answer[1] + answer[2];
//		int[] answer = new int[3];
//		int index = -1;
//		for (int i = 0; i < dartResult.length(); i++) {
//			char c = dartResult.charAt(i);
//			switch (c) {
//			case 'S':
//				break;
//			case 'D':
//				answer[index] = (int) Math.pow(answer[index], 2);
//				break;
//			case 'T':
//				answer[index] = (int) Math.pow(answer[index], 3);
//				break;
//			case '*':
//				if (index > 0) {
//					answer[index - 1] *= 2;
//				}
//				answer[index] *= 2;
//				break;
//			case '#':
//				answer[index] *= -1;
//				break;
//			default:
//				index++;
//				if (dartResult.charAt(i + 1) == '0') {
//					i++;
//					answer[index] = 10;
//				} else {
//					answer[index] = Character.getNumericValue(c);
//				}
//			}
//		}
//		return answer[0] + answer[1] + answer[2];
	}
}
