package coding_basic_training;

public class ShuffleString {
//	문자열 섞기
	public String solution(String str1, String str2) {
		char[] answer = new char[str1.length() * 2];
		for (int i = 0; i < str1.length(); i++) {
			answer[i * 2] = str1.charAt(i);
			answer[i * 2 + 1] = str2.charAt(i);
//			answer를 String으로 바꿔 answer += "" + str1.charAt(i) + str2.charAt(i); 도 가능
		}

//		char array to string
//		1. 생성자 이용
		return new String(answer);
//		2. valueOf 함수 이용
//		return String.valueOf(answer);
//		3. stringbuilder나 stream을 이용할 수 있음
	}
}
