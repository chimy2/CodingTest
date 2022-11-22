package brute_force_search;

public class MinimumRectangle {
//	최소직사각형
	public int solution(int[][] sizes) {
		int min = 10000, max = 0;
		for (int[] arr : sizes) {
			min = Math.min(min, Math.min(arr[0], arr[1]));
			max = Math.max(max, Math.max(arr[0], arr[1]));
		}
		return min * max;
//		return Arrays.stream(sizes).reduce((a, b) -> new int[] { Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])),
//				Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1])) }).map(it -> it[0] * it[1]).get();
	}
}