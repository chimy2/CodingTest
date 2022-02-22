package coding_basic_training;

public class ConcatenateLarger {
//	더 크게 합치기
	public int solution(int a, int b) {
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		return Math.max(Integer.parseInt(strA + strB), Integer.parseInt(strB + strA));
	}
}
