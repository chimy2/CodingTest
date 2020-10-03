package hash;

import java.util.HashMap;
import java.util.Map;

public class UncompletedPlayer {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> marathon = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			marathon.put(participant[i], getHashValue(marathon, participant[i]) + 1);
		}
		for (int i = 0; i < completion.length; i++) {
			marathon.put(completion[i], getHashValue(marathon, completion[i]) - 1);
		}
		// marathon.forEach((k,v) -> { if(v==1) return ""; });
		for (Map.Entry<String, Integer> entry : marathon.entrySet()) {
			if (entry.getValue() == 1) return entry.getKey();
		}
		return "";
	}
	public static int getHashValue(HashMap<String, Integer> hash, String check) {
		return hash.get(check) == null ? 0 : hash.get(check);
	}
}
