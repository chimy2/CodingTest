package exercise;

public class CreateJadenCaseString {
    public String solution(String s) {
		StringBuffer answer=new StringBuffer();
		answer.append(Character.toUpperCase(s.charAt(0)));
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i);
			if(s.charAt(i-1)==' ') {
				answer.append(Character.toUpperCase(c));
			}else {
				answer.append(Character.toLowerCase(c));
			}
		}
        return answer.toString();
    }
}
