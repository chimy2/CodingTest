package coding_basic_training;

public class ConcatenatedNumbers {
//	이어 붙인 수
	public int solution(int[] num_list) {
		String a = "", b = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				a += num_list[i];
			} else {
				b += num_list[i];
			}
		}
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
}
