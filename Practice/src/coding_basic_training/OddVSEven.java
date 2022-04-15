package coding_basic_training;

public class OddVSEven {
//	홀수 vs 짝수
	public int solution(int[] num_list) {
		int odd = 0;
		int even = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				odd += num_list[i];
			} else {
				even += num_list[i];
			}
		}
		return odd > even ? odd : even;
	}
}
