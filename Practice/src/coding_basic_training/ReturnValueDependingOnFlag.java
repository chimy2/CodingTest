package coding_basic_training;

public class ReturnValueDependingOnFlag {
//	flag에 따라 다른 값 반환하기
	public int solution(int a, int b, boolean flag) {
		return flag ? a + b : a - b;
//        return a + (flag ? 1 : -1) * b;
	}
}
