package exercise;

public class FoodFightContest {
//	푸드 파이트 대회
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < food.length; i++) {
			sb.append(String.valueOf(i).repeat(food[i] / 2));
		}
		return sb.toString() + "0" + sb.reverse();
//		바로 리턴하는 것보다 string 선언 후 고정된 부분을 넣고 덧붙이는게 더 효율적
//		String s = sb.toString() + "0";
//		return s + sb.reverse();
	}
}