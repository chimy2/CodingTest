package kakao_blind_recruitment2023;

//	이모티콘 할인행사
public class EmoticonDiscountEvent {

	private int[] answer;

	public int[] solution(int[][] users, int[] emoticons) {
		answer = new int[2];

		int[] rate = new int[emoticons.length];

		permutation(users, emoticons, rate, 0);

		return answer;
	}

	public void permutation(int[][] users, int[] emoticons, int[] rate, int num) {
		if (num == rate.length) {
			cal(users, emoticons, rate);
			return;
		}

		for (int i = 10; i <= 40; i += 10) {
			rate[num] = i;
			permutation(users, emoticons, rate, num + 1);
		}
	}

	public void cal(int[][] users, int[] emoticons, int[] rate) {
		int[] result = new int[2];

		for (int[] user : users) {
			int sum = 0;
			boolean isJoin = false;
			for (int i = 0; i < emoticons.length; i++) {
				if (rate[i] >= user[0]) {
					sum += emoticons[i] * (100 - rate[i]) / 100;
				}
				if (user[1] <= sum) {
					isJoin = true;
					break;
				}
			}
			if (isJoin) {
				result[0]++;
			} else {
				result[1] += sum;
			}
		}

		if (result[0] > answer[0]) {
			answer = result;
		} else if (result[0] == answer[0] && result[1] > answer[1]) {
			answer[1] = result[1];
		}
	}
}