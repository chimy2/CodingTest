package coding_basic_training;

import java.util.stream.IntStream;

public class CreateArray1 {
//	배열 만들기1{
	public int[] solution(int n, int k) {
		return IntStream.rangeClosed(1, n / k).map(i -> i * k).toArray();
	}
}