package introduction_coding_tests;

public class IcedAmericano {
//	아이스 아메리카노
	public int[] solution(int money) {
		return new int[] { money / 5500, money % 5500 };
	}
}