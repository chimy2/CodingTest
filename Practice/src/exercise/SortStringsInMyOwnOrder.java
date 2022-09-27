package exercise;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsInMyOwnOrder {
//	문자열 내 마음대로 정렬하기
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if (o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				} else {
					return o1.charAt(n) - o2.charAt(n);
				}
			}
		});
		return strings;
//		String temp = "";
//		for (int i = 0; i < strings.length; i++) {
//			for (int j = i; j < strings.length; j++) {
//				if (strings[i].charAt(n) > strings[j].charAt(n)) {
//					temp = strings[j];
//					strings[j] = strings[i];
//					strings[i] = temp;
//				}
//				if (strings[i].charAt(n) == strings[j].charAt(n)) {
//					if (strings[i].compareTo(strings[j]) > 0) {
//						temp = strings[j];
//						strings[j] = strings[i];
//						strings[i] = temp;
//					}
//				}
//			}
//		}
//		return strings;
	}
}