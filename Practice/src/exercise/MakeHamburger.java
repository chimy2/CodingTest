package exercise;

public class MakeHamburger {
//	햄버거 만들기
	public int solution(int[] ingredient) {
		int answer = 0;
		for (int i = 0, j = 0; i < ingredient.length; i++) {
			if (ingredient[i] == 1 && j >= 3 && ingredient[j - 3] == 1 && ingredient[j - 2] == 2
					&& ingredient[j - 1] == 3) {
				answer++;
				j -= 3;
				continue;
			}
			ingredient[j++] = ingredient[i];
		}
		return answer;
	}
}