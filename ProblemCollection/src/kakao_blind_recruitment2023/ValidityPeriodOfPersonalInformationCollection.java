package kakao_blind_recruitment2023;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidityPeriodOfPersonalInformationCollection {
//	개인정보 수집 유효기간
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> li = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		LocalDate now = LocalDate.parse(today.replaceAll("\\.", "-"));
//		LocalDate now = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
		for (String s : terms) {
			String[] arr = s.split(" ");
			map.put(arr[0], Integer.parseInt(arr[1]));
		}
		for (int i = 0; i < privacies.length; i++) {
			String[] arr = privacies[i].split(" ");
			LocalDate collectDate = LocalDate.parse(arr[0].replaceAll("\\.", "-"));
//			LocalDate collectDate = LocalDate.parse(arr[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
			if (now.compareTo(collectDate.plusMonths(map.get(arr[1]))) >= 0) {
				li.add(i + 1);
			}
		}
		return li.stream().mapToInt(i -> i).toArray();
	}
}