package introduction_coding_tests;

public class FindNumbers {
//	숫자 찾기
	public int solution(int num, int k) {
		int answer = String.valueOf(num).indexOf(String.valueOf(k));
		return answer >= 0 ? answer + 1 : -1;
//        return ("-" + num).indexOf(String.valueOf(k));
	}
}