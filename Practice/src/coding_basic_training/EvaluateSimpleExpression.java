package coding_basic_training;

public class EvaluateSimpleExpression {
//	간단한 식 계산하기
	public int solution(String binomial) {
		String[] s = binomial.split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[2]);
		switch (s[1]) {
		case "+":
			a += b;
			break;
		case "-":
			a -= b;
			break;
		case "*":
			a *= b;
		}
		return a;
	}
}