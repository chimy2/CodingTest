package kakao_tech_internship2022;

public class PersonalityTypeTest {
//	성격 유형 검사하기
	public String solution(String[] survey, int[] choices) {
		String s = "RTCFJMAN";
		StringBuilder sb = new StringBuilder();
		int[] score = { 0, 0, 0, 0 };
		for (int i = 0; i < survey.length; i++) {
			switch (survey[i].charAt(0)) {
			case 'R':
				score[0] += choices[i] - 4;
				break;
			case 'T':
				score[0] += 4 - choices[i];
				break;
			case 'C':
				score[1] += choices[i] - 4;
				break;
			case 'F':
				score[1] += 4 - choices[i];
				break;
			case 'J':
				score[2] += choices[i] - 4;
				break;
			case 'M':
				score[2] += 4 - choices[i];
				break;
			case 'A':
				score[3] += choices[i] - 4;
				break;
			case 'N':
				score[3] += 4 - choices[i];
				break;
			}
		}
		for (int i = 0; i < 4; i++) {
			sb.append(s.charAt(i * 2 + (score[i] > 0 ? 1 : 0)));
		}
		return sb.toString();
	}
}