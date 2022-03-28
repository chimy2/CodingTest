package coding_basic_training;

public class ReadVertically {
//	세로 읽기
	public String solution(String my_string, int m, int c) {
		int len = my_string.length();
		char[] arr = new char[len / m];
		for (int i = 0; i < len / m; i++) {
			arr[i] = my_string.charAt(m * i + c - 1);
		}
		return String.valueOf(arr);
	}
}