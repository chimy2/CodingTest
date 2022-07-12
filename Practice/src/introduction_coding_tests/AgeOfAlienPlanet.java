package introduction_coding_tests;

public class AgeOfAlienPlanet {
//	외계행성의 나이
	public String solution(int age) {
		String answer = "";
		for (int i = age; i > 0; i /= 10) {
			answer = (char) (i % 10 + 'a') + answer;
		}
		return answer;
	}
}