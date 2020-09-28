package exercise;

public class RemoveSmallestNumber {
	public int[] solution(int[] arr) {
		int[] answer = { -1 };
		int min = arr[0], index = 0;
		if (arr.length == 1)
			return answer;
		else {
			answer = new int[arr.length - 1];
			for (int i = 1; i < arr.length; i++) {
				if (min > arr[i]) min = arr[i];
			}
			for (int i = 0; answer[answer.length - 1] == 0; i++) {
				if (min != arr[i]) answer[index++] = arr[i];
			}
		}
		return answer;
	}
}
