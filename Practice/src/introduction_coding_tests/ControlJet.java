package introduction_coding_tests;

import java.util.Arrays;

public class ControlJet {
//	컨트롤 제트
	public int solution(String s) {
		s = s.replaceAll("-?\\d{1,} Z ?", "");
		return s.length() > 0 ? Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).sum() : 0;
	}
}