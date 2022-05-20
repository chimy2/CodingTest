package coding_basic_training;

import java.util.Arrays;

public class UpFrom5thFromEnd {
//	뒤에서 5등 위로
	public int[] solution(int[] num_list) {
		return Arrays.copyOfRange(Arrays.stream(num_list).sorted().toArray(), 5, num_list.length);
//		return Arrays.stream(num_list).sorted().skip(5).toArray();
	}
}