package introduction_coding_tests;

import java.util.Arrays;

public class TallerPeopleThanMurukey {
//	머쓱이보다 키 큰 사람
	public int solution(int[] array, int height) {
		return (int) Arrays.stream(array).filter(i -> i > height).count();
	}
}