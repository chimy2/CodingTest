package exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunningRace {
//	달리기 경주
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < players.length; i++) {
			m.put(players[i], i);
		}
		for (int i = 0; i < callings.length; i++) {
			int idx = m.get(callings[i]);
			m.put(players[idx - 1], idx);
			m.put(callings[i], idx - 1);
			players[idx] = players[idx - 1];
			players[idx - 1] = callings[i];
		}
		return players;
//		List<String> li = Arrays.asList(players);
//		int count = 1;
//		for (int i = 0; i < callings.length; i++) {
//			String s = callings[i];
//			if (i + 1 < callings.length && callings[i + 1].equals(s)) {
//				count++;
//			} else {
//				int idx = 0;
//				for (int j = 0; j < players.length; j++) {
//					if (s.equals(players[j])) {
//						idx = j;
//						break;
//					}
//				}
//				for (int j = 0; j < count; j++) {
//					players[idx - j] = players[idx - j - 1];
//				}
//				players[idx - count] = s;
//				count = 1;
//			}
//		}
//		int[] arr = new int[players.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}
//		Map<String, Integer> call = new HashMap<String, Integer>();
//		for (int i = 0; i < players.length; i++) {
//			call.put(players[i], i);
//		}
//		for (int i = 0; i < callings.length; i++) {
//			String s = callings[i];
//			int idx = li.indexOf(s);
//			if (i + 1 < callings.length && li.get(idx - 1) == s)
//				continue;
//		}
//		for (int i = 0; i < callings.length; i++) {
//			String s = callings[i];
//			int idx = li.indexOf(s);
//			if (i + 1 < callings.length && li.get(idx - 1) == s)
//				continue;
//			li.set(idx, li.get(idx - 1));
//			li.set(idx - 1, s);
//		}
//		return players;
	}
//	public String[] solution(String[] players, String[] callings) {
//		Map<String, Integer> call = new HashMap<String, Integer>();
//		String temp = "";
//		for (int i = 0; i < callings.length; i++) {
//			call.put(callings[i], call.getOrDefault(callings[i], 0) + 1);
//		}
//		System.out.println(call);
//		while (!call.isEmpty()) {
//			for (int i = players.length - 1; i >= 0; i--) {
//				//System.out.println(players[i]);
//				int n = call.getOrDefault(players[i], 0);
//				if (n > 0) {
//					temp = players[i];
//					System.out.println(temp);
//					players[i] = players[i - 1];
//					players[i - 1] = temp;
//                    i++;
//					if (n > 1) {
//						call.put(temp, n - 1);
//					} else {
//						call.remove(temp);
//					}
//					System.out.println(Arrays.toString(players));
//				}
//			}
//			System.out.println(call);
//		}
//		return players;
//	}
}