package programmers_codechallenge2025_round2;

// 택배 상자 꺼내기
public class UnpackDeliveryBox {
	public int solution(int n, int w, int num) {
		int answer = 0;
		int seq = num % w == 0 ? w : num % w;
		boolean isOdd = (num - 1) / w % 2 == 0;

		for (int i = num; i <= n; answer++) {
			if ((isOdd && (i - 1) / w % 2 == 0) || (!isOdd && (i - 1) / w % 2 == 1)) {
				i += (w - seq) * 2 + 1;
			} else {
				i += seq * 2 - 1;
			}
		}

		return answer;
	}
}