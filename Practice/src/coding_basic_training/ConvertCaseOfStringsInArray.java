package coding_basic_training;

import java.util.stream.IntStream;

public class ConvertCaseOfStringsInArray {
//	배열에서 문자열 대소문자 변환하기
	public String[] solution(String[] strArr) {
		return IntStream.range(0, strArr.length)
				.mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
	}
}