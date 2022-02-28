package coding_basic_training;

public class HandleCode {
//	코드 처리하기
	public String solution(String code) {
		String answer = "";
		boolean mode = false;
		for (int i = 0; i < code.length(); i++) {
			String temp = Character.toString(code.charAt(i));
			if (mode) {
				if (!temp.equals("1")) {
					if (i % 2 == 1)
						answer += temp;
				} else {
					mode = !mode;
				}
			} else {
				if (!temp.equals("1")) {
					if (i % 2 == 0)
						answer += temp;
				} else {
					mode = !mode;
				}
			}
		}
//		mode를 숫자로 바꾸고 조건을 간결하게 정리한 버전
//		int mode = 0;
//		for (int i = 0; i < code.length(); i++) {
//			String temp = String.valueOf(code.charAt(i));
//			if (temp.equals("1")) {
//				mode = mode == 0 ? 1 : 0;
//				continue;
//			}
//			if ((mode + i) % 2 == 0)
//				answer += temp;
//		}
		return !answer.equals("") ? answer : "EMPTY";
//		문자열 길이로 비었는지 판별
//		return answer.length() != 0 ? answer : "EMPTY";
	}
}
