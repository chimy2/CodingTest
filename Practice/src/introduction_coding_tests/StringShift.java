package introduction_coding_tests;

public class StringShift {
//	문자열 밀기
	public int solution(String A, String B) {
		int answer = -1;
		char[] c = A.toCharArray();
		for (int i = 0; i < c.length; i++) {
			boolean checked = true;
			for (int j = 0; j < c.length && checked; j++) {
				if (c[j] != B.charAt((i + j) % c.length))
					checked = false;
			}
			if (checked) {
				answer = i;
				break;
			}
		}
		return answer;
//        return (B+B).indexOf(A);
	}
}