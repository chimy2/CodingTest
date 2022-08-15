package introduction_coding_tests;

public class SuccessfulLogin {
//	로그인 성공?
	public String solution(String[] id_pw, String[][] db) {
		String id = id_pw[0], pw = id_pw[1];
		for (int i = 0; i < db.length; i++) {
			if (id.equals(db[i][0])) {
				if (pw.equals(db[i][1])) {
					return "login";
				} else {
					return "wrong pw";
				}
			}
		}
		return "fail";
	}
}