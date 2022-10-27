package sort;

import java.util.Arrays;

public class KthNumber {
//	K번째수
	public int[] solution(int[] array, int[][] commands) {
		return Arrays.stream(commands)
				.mapToInt(i -> Arrays.stream(Arrays.copyOfRange(array, i[0] - 1, i[1])).sorted().toArray()[i[2] - 1])
				.toArray();
//		int[] temp = {};
//		int[] answer = new int[commands.length];
//		for (int i = 0; i < commands.length; i++) {
//			temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
//			Arrays.sort(temp);
//			answer[i] = temp[commands[i][2] - 1];
//		}
//		return answer;
	}
}
