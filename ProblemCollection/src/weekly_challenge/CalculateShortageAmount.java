package weekly_challenge;

public class CalculateShortageAmount {
//	부족한 금액 계산하기
	public long solution(int price, int money, int count) {
		return Math.max(0, (long) count * (2 * price + (count - 1) * price) / 2 - money);
//		long answer = (long) price * count * (count + 1) / 2 - money;
//		return answer > 0 ? answer : 0;
	}
}