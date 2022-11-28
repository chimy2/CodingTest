package exercise;

public class NumberPairs {
//	숫자 짝꿍
	public String solution(String X, String Y) {
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[10][2];
		for (char c : X.toCharArray())
			arr[c - 48][0]++;
		for (char c : Y.toCharArray()) {
			arr[c - 48][1]++;
		}
		for (int i = 9; i >= 0; i--) {
			int min = Math.min(arr[i][0], arr[i][1]);
			if (i == 0 && sb.length() == 0 && min > 1) {
				sb.append(0);
			} else {
				sb.append(String.valueOf(i).repeat(min));
//				다른 타입의 데이터를 + 연산시 효율이 떨어진다
//				sb.append((i + "").repeat(min));
			}
		}
		return sb.length() > 0 ? sb.toString() : "-1";
	}
}