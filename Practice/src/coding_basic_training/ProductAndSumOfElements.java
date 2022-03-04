package coding_basic_training;

public class ProductAndSumOfElements {
//	원소들의 곱과 합
	public int solution(int[] num_list) {
		int a = 0, b = 1;
		for (int i = 0; i < num_list.length; i++) {
			a += num_list[i];
			b *= num_list[i];
		}
		return a * a > b ? 1 : 0;
//		Array.Stream을 이용한 방법
//        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;

	}
}
