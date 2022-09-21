package hash;

import java.util.Arrays;

public class Poncketmon {
//	폰켓몬
	public int solution(int[] nums) {
		int answer = (int) Arrays.stream(nums).distinct().count();
		return answer > nums.length / 2 ? nums.length / 2 : answer;
//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
	}
}