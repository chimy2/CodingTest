package exercise;

public class WeaponsOfKnights {
//	기사단원의 무기
	public int solution(int number, int limit, int power) {
		int answer = 0;
		for (int i = 1; i <= number; i++) {
			int count = 0;
			for (int j = 1; j * j <= i && count < limit; j++) {
				if (i % j == 0) {
					count += j * j == i ? 1 : 2;
				}
			}
			answer += limit < count ? power : count;
		}
		return answer;
//		number가 10만이하까지 제한되기 때문에 매번 해당 수의 약수의 개수를 구하는 것 대신
//		한번에 끝까지 구하여 연산하는게 더 효율적이다
//        int answer = 0;
//        int[] count = new int[number + 1];    
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number / i; j++) {
//                count[i * j]++;
//            }
//        }
//        for (int i = 1; i <= number; i++) {
//            if (count[i] > limit) {
//                answer += power;
//            } else {
//                answer += count[i];
//            }
//        }
//        return answer;
	}
}