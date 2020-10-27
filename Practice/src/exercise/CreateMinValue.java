package exercise;

public class CreateMinValue {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		sortAsc(A, 0, A.length - 1);
		sortAsc(B, 0, B.length - 1);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];
		}
		return answer;
	}

	public static void sortAsc(int[] A, int start, int end) {
		int num = start;
		int left = start + 1;
		int right = end;
		if (start >= end)
			return;
		while (left <= right) {
			for (; left <= end && A[left] <= A[num]; left++)
				;
			for (; start < right && A[right] >= A[num]; right--)
				;
			if (left > right) {
				int temp = A[num];
				A[num] = A[right];
				A[right] = temp;
			} else {
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;
			}
		}
		sortAsc(A, start, right - 1);
		sortAsc(A, right + 1, end);
	}
}
