package introduction_coding_tests;

import java.util.Arrays;

public class AlienDictionary {
//	외계어 사전
	public int solution(String[] spell, String[] dic) {
		String spells = Arrays.stream(spell).reduce("", (ac, c) -> ac + c).toString();
		for (int i = 0; i < dic.length; i++) {
			String s = dic[i].replaceAll("[^" + spells + "]", "");
			if (s.length() == spells.length()) {
				int count = 0;
				for (int j = 0; j < spell.length; j++) {
					if (s.contains(spell[j]))
						count++;
				}
				if (spells.length() == count)
					return 1;
			}
		}
		return 2;
	}
}