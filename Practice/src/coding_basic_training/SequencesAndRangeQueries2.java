package coding_basic_training;

public class SequencesAndRangeQueries2 {
//	수열과 구간 쿼리2
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int min = -1;
			int max = queries[i][2];
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				if (arr[j] > max && (min == -1 || min != -1 && arr[j] < min)) {
					min = arr[j];
				}
			}
			answer[i] = min;
		}
		return answer;
//		intstream을 이용한 방법
//        return IntStream.range(0, queries.length)
//                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
//                        .map(i -> arr[i])
//                        .filter(i -> i > queries[q][2])
//                        .min().orElse(-1)
//                ).toArray();
	}
}