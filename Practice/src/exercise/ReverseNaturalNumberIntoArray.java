package exercise;

public class ReverseNaturalNumberIntoArray {
//	자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
		String before = String.valueOf(n);
		int[] answer = new int[before.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Character.getNumericValue(before.charAt(before.length() - i - 1));
		}
		return answer;
//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
	}
}