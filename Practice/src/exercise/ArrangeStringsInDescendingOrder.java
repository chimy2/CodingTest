package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrangeStringsInDescendingOrder {
//	문자열 내림차순으로 배치하기
	public String solution(String s) {
		return Arrays.stream(s.split("")).sorted((a, b) -> b.compareTo(a)).collect(Collectors.joining());

//		return Arrays.stream(s.split("")).sorted(new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				if (o1.charAt(0) < 97 && o2.charAt(0) >= 97) {
//					return 1;
//				} else if (o1.charAt(0) >= 97 && o2.charAt(0) < 97) {
//					return -1;
//				} else {
//					return o2.compareTo(o1);
//				}
//			}
//		}).collect(Collectors.joining());

//		StringBuffer sb = new StringBuffer();
//		Integer[] a = new Integer[s.length()];
//		for (int i = 0; i < s.length(); i++)
//			a[i] = s.charAt(i) / 1;
//		Arrays.sort(a, Collections.reverseOrder());
//		for (int i = 0; i < a.length; i++)
//			sb.append((char) a[i].intValue());
//
//		return sb.toString();
	}
}