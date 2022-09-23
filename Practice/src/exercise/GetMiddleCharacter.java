package exercise;

public class GetMiddleCharacter {
//	가운데 글자 가져오기
	public String solution(String s) {
		return s.substring((s.length() - 1) / 2, (s.length() + 2) / 2);
//        return s.substring(s.length()%2==0?s.length()/2-1:s.length()/2,s.length()/2+1);
	}
}