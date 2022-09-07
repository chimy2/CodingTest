package introduction_coding_tests;

public class OXQuiz {
//	OX퀴즈
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] arr = quiz[i].split(" ");
			int temp = Integer.parseInt(arr[0]);
			temp += Integer.parseInt(arr[2]) * (arr[1].equals("+") ? 1 : -1);
			if (temp == Integer.parseInt(arr[4])) {
				answer[i] = "O";
			} else {
				answer[i] = "X";
			}
		}
		return answer;
	}
}