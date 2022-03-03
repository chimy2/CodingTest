package coding_basic_training;

public class DiceGame2 {
//	주사위게임2
	public int solution(int a, int b, int c) {
		int answer = a + b + c;
		if (a == b || a == c || b == c) {
			if (a == b && b == c)
				answer *= Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
			answer *= a * a + b * b + c * c;
		}
		return answer;

//		hashset을 이용하는 방법 
//		int answer = 1;
//		HashSet<Integer> s = new HashSet<Integer>();
//		s.add(a);
//		s.add(b);
//		s.add(c);
//		for (int i = 1; i <= 4 - s.size(); i++) {
//			answer *= Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i);
//		}
//		return answer;
	}
}
