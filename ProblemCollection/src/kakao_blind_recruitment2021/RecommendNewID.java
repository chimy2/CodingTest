package kakao_blind_recruitment2021;

public class RecommendNewID {
//	신규 아이디 추천
	public String solution(String new_id) {
		String answer = new_id.toLowerCase();
		answer = answer.replaceAll("[^a-z\\d-_\\.]", "");
		answer = answer.replaceAll("\\.+", ".");
		answer = answer.replaceAll("^\\.|\\.$", "");
		if (answer.length() == 0) {
			answer = "aaa";
		} else if (answer.length() < 3) {
			answer += (answer.charAt(answer.length() - 1) + "").repeat(3 - answer.length());
		} else if (answer.length() > 15) {
			answer = answer.substring(0, answer.charAt(14) == '.' ? 14 : 15);
		}
		return answer;

//		new_id = new_id.toLowerCase();
//		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
//		new_id = new_id.replaceAll("\\.{2,}", ".");
//		new_id = new_id.replaceAll("^\\.", "");
//		new_id = new_id.replaceAll("\\.$", "");
//
//		int len = new_id.length();
//		if (len == 0)
//			new_id += "a";
//		if (len >= 16) {
//			new_id = new_id.substring(0, 15);
//			new_id = new_id.replaceAll("\\.$", "");
//		} else if (len <= 2) {
//			while (new_id.length() < 3) {
//				new_id += new_id.charAt(new_id.length() - 1);
//			}
//		}
//		return new_id;
	}
}
