package introduction_coding_tests;

public class CalculateString {
//	문자열 계산하기
	public int solution(String my_string) {
		String[] s = my_string.split(" ");
		int answer = Integer.parseInt(s[0]);
		boolean plus = true;
		for (int i = 1; i < s.length; i++) {
			if (s[i].equals("+")) {
				plus = true;
			} else if (s[i].equals("-")) {
				plus = false;
			} else {
				answer += Integer.parseInt(s[i]) * (plus ? 1 : -1);
			}
		}
		return answer;
//        return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
	}
}