package introduction_coding_tests;

public class AntArmy {
//	개미 군단
	public int solution(int hp) {
		return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
	}
}