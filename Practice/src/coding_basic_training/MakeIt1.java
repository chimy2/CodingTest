package coding_basic_training;

public class MakeIt1 {
//	1로 만들기
	public int solution(int[] num_list) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			while (num_list[i] != 1) {
				if (num_list[i] % 2 == 0) {
					num_list[i] /= 2;
				} else {
					num_list[i] = (num_list[i] - 1) / 2;
				}
				answer++;
			}
		}
		return answer;
//        return Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum();
	}
}