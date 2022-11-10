package kakao_internship2020;

public class PressKeypad {
//	키패드 누르기
	public String solution(int[] numbers, String hand) {
		StringBuffer s = new StringBuffer();
		int l = 10, r = 12;
		for (int i : numbers) {
			if (i == 0)
				i = 11;
			if (i % 3 == 1 || i % 3 == 2 && (Math.abs((l - i) / 3 + (l - i) % 3) < Math.abs((r - i) / 3 + (r - i) % 3)
					|| Math.abs((l - i) / 3 + (l - i) % 3) == Math.abs((r - i) / 3 + (r - i) % 3)
							&& hand.equals("left"))) {
				s.append("L");
				l = i;
			} else {
				s.append("R");
				r = i;
			}
		}
		return s.toString();
//		String answer = "";
//		int l = 10, r = 12;
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == 0)
//				numbers[i] = 11;
//			if (numbers[i] % 3 == 1) {
//				answer += "L";
//				l = numbers[i];
//			} else if (numbers[i] % 3 == 2) {
//				int l2 = l;
//				int r2 = r;
//				int lc = 0;
//				int rc = 0;
//				while (l2 < numbers[i] || r2 < numbers[i]) {
//					if (l2 + 3 <= numbers[i]) {
//						l2 += 3;
//						lc++;
//					} else if (l2 + 1 <= numbers[i]) {
//						l2++;
//						lc++;
//					}
//					if (r2 + 3 <= numbers[i]) {
//						r2 += 3;
//						rc++;
//					} else if (r2 + 1 <= numbers[i]) {
//						r2++;
//						rc++;
//					}
//				}
//				while (l2 > numbers[i] || r2 > numbers[i]) {
//					if (l2 - 3 >= numbers[i]) {
//						l2 -= 3;
//						lc++;
//					} else if (l2 - 1 >= numbers[i]) {
//						l2--;
//						lc++;
//					}
//					if (r2 - 3 >= numbers[i]) {
//						r2 -= 3;
//						rc++;
//					} else if (r2 - 1 >= numbers[i]) {
//						r2--;
//						rc++;
//					}
//				}
//				if (lc < rc || lc == rc && hand.equals("left")) {
//					answer += "L";
//					l = numbers[i];
//				} else {
//					answer += "R";
//					r = numbers[i];
//				}
//			} else {
//				answer += "R";
//				r = numbers[i];
//			}
//		}
//		return answer;
	}
}
