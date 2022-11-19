package kakao_recuritment_linked_internship2021;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberStringAndEnglishWords {
//	숫자 문자열과 영단어
	public int solution(String s) {
		StringBuilder sb = new StringBuilder();
		Matcher m = Pattern.compile("(\\d)+|(zero|one|two|three|four|five|six|seven|eight|nine)").matcher(s);
		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		while (m.find()) {
			try {
				sb.append(Integer.parseInt(m.group()));
			} catch (Exception e) {
				for (int i = 0; i < words.length; i++) {
					if (words[i].equals(m.group())) {
						sb.append(i);
						break;
					}
				}
			}
		}
		return Integer.parseInt(sb.toString());
//		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
//		for (int i = 0; i < words.length; i++) {
//			s = s.replaceAll(words[i], i + "");
//		}
//		return Integer.parseInt(s);
	}
}