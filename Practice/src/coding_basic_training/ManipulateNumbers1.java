package coding_basic_training;

public class ManipulateNumbers1 {
//	수 조작하기1
	public int solution(int n, String control) {
		for (char c : control.toCharArray()) {
			switch (c) {
			case 'w': {
				n++;
				break;
			}
			case 's': {
				n--;
				break;
			}
			case 'a': {
				n -= 10;
				break;
			}
			case 'd': {
				n += 10;
			}
			}
		}
		return n;
	}
}
