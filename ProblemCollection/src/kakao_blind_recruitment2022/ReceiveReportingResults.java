package kakao_blind_recruitment2022;

public class ReceiveReportingResults {
//	신고 결과 받기
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		boolean[][] check = new boolean[answer.length][answer.length];
		for (int i = 0; i < report.length; i++) {
			String[] s = report[i].split(" ");
			int idxL = -1, idxR = -1;
			for (int j = 0; idxL < 0 || idxR < 0; j++) {
				if (s[0].equals(id_list[j])) {
					idxL = j;
				}
				if (s[1].equals(id_list[j])) {
					idxR = j;
				}
			}
			check[idxL][idxR] = true;
		}
		for (int y = 0; y < check.length; y++) {
			int count = 0;
			for (int x = 0; x < check[0].length && count < k; x++) {
				if (check[x][y])
					count++;
			}
			if (count == k) {
				for (int x = 0; x < check.length; x++) {
					if (check[x][y])
						answer[x]++;
				}
			}
		}
		return answer;
		// key: 신고당한놈, value: 몇명한테 당했는지
//		Map<String, Set<String>> map = new HashMap<>();
//
//		for (String rep : report) {
//			String[] arr = rep.split(" ");
//			Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
//			set.add(arr[0]);
//			map.put(arr[1], set);
//		}
//
//		// key: 알림받을 놈, value: 몇번 알림받을지
//		Map<String, Integer> countMap = new LinkedHashMap<>();
//
//		for (String id : id_list) {
//			countMap.put(id, 0);
//		}
//
//		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
//			if (entry.getValue().size() >= k) { // 정지당할놈
//				for (String value : entry.getValue()) {
//					countMap.put(value, countMap.getOrDefault(value, 0) + 1);
//				}
//			}
//		}
//
//		return countMap.values().stream().mapToInt(Integer::intValue).toArray();
	}
}