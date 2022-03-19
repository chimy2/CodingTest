package coding_basic_training;

public class ReverseStringMultipleTimes {
//	문자열 여러 번 뒤집기
	public String solution(String my_string, int[][] queries) {
		char[] c = my_string.toCharArray();
		for (int i = 0; i < queries.length; i++) {
			int x = queries[i][0];
			int y = queries[i][1];
			for (int j = x; j < x + (y - x + 1) / 2; j++) {
				char temp = c[j];
				c[j] = c[y - (j - x)];
				c[y - (j - x)] = temp;
			}
		}
		return new String(c);
	}
}
