package coding_basic_training;

import java.util.Arrays;

public class UpTo5thFromEnd {
//	뒤에서 5등까지
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		return Arrays.copyOf(num_list, 5);
//        return Arrays.stream(num_list)
//                .sorted()
//                .limit(5)
//                .toArray();
	}
}