package exercise;

public class CountOfPAndYInString {
//	문자열 내 p와 y의 개수
	boolean solution(String s) {
		int p = s.replaceAll("[^pP]", "").length();
		int y = s.replaceAll("[^yY]", "").length();
		return p == y;
//		Matcher matcher = Pattern.compile("[pP]").matcher(s);
//		int a = 0;
//		while (matcher.find())
//			a++;
//		matcher = Pattern.compile("[yY]").matcher(s);
//		while (matcher.find())
//			a--;
//		return a == 0 ? true : false;
	}
}