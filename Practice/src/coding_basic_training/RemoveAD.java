package coding_basic_training;

import java.util.Arrays;

public class RemoveAD {
//	ad 제거하기
	public String[] solution(String[] strArr) {
		return Arrays.stream(strArr).filter(i -> !i.contains("ad")).toArray(String[]::new);
	}
}