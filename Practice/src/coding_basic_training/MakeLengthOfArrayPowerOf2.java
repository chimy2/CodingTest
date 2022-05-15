package coding_basic_training;

import java.util.ArrayList;

public class MakeLengthOfArrayPowerOf2 {
//	배열의 길이를 2의 거듭제곱으로 만들기
	public int[] solution(int[] arr) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i : arr) {
			li.add(i);
		}
		for (int i = 1;; i *= 2) {
			if (i >= li.size()) {
				for (int j = li.size(); j < i; j++) {
					li.add(0);
				}
				break;
			}
		}
		return li.stream().mapToInt(i -> i).toArray();
//        return Arrays.copyOf(arr, (int) Math.pow(2, Math.ceil(Math.log(arr.length) / Math.log(2))));
	}
}