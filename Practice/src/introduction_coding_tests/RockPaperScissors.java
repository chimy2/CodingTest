package introduction_coding_tests;

public class RockPaperScissors {
//	가위 바위 보
	public String solution(String rsp) {
		String answer = "";
		for (String i : rsp.split("")) {
			switch (i) {
			case "2":
				answer += "0";
				break;
			case "0":
				answer += "5";
				break;
			case "5":
				answer += "2";
			}
		}
		return answer;
	}
}