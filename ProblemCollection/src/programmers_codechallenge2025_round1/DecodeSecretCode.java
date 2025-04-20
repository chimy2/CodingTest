package programmers_codechallenge2025_round1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 비밀 코드 해독
public class DecodeSecretCode {
	public int solution(int n, int[][] q, int[] ans) {
		int[] arr = new int[5];
		List<int[]> li = new ArrayList<int[]>();
		HashMap<int[], Integer> map = new HashMap<int[], Integer>();

		insertElement(li, n, arr, 0, 1);
		
		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < li.size(); j++) {
				int l = 0, r = 0, count = 0;

				while (l < 5 && r < 5) {
					if (q[i][l] == li.get(j)[r]) {
						l++;
						r++;
						count++;
					} else if (q[i][l] > li.get(j)[r]) {
						r++;
					} else {
						l++;
					}
				}
				if (ans[i] == count) {
					map.put(li.get(j), map.getOrDefault(li.get(j), 0) + 1);
				}
			}
		}
		return (int) map.values().stream().filter(i -> i == q.length).count();
	}

	public void insertElement(List<int[]> li, int n, int[] arr, int idx, int num) {
		if (idx == 5) {
			li.add(Arrays.copyOf(arr, arr.length));
			return;
		}
		if (num > n) return;
		arr[idx] = num;
		insertElement(li, n, arr, idx + 1, num + 1);
		arr[idx] = 0;
		insertElement(li, n, arr, idx, num + 1);

	}
}