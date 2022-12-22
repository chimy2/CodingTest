package exercise;

public class CardDeck {
//	카드 뭉치
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		boolean answer = true;
		for (int i = 0, j = 0, k = 0; k < goal.length; k++) {
			if (i < cards1.length && cards1[i].equals(goal[k])) {
				i++;
			} else if (j < cards2.length && cards2[j].equals(goal[k])) {
				j++;
			} else {
				answer = false;
				break;
			}
		}
		return answer ? "Yes" : "No";
	}
}