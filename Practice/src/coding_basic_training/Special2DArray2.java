package coding_basic_training;

public class Special2DArray2 {
//	특별한 이차원 배열2
	public int solution(int[][] arr) {
		int answer = 1;
		boolean checked = true;
		for (int i = 0; i < arr.length && checked; i++) {
			for (int j = i + 1; j < arr.length && checked; j++) {
				if (arr[i][j] != arr[j][i]) {
					answer = 0;
					checked = false;
				}
			}
		}
		return answer;
	}
}