package brute_force_search;

//	모음사전
public class DictionaryOfPhonemes {
	private boolean isFind = false;

	public int solution(String word) {
		char[] letter = { 'A', 'E', 'I', 'O', 'U' };
		StringBuilder sb = new StringBuilder();
		int goal = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < letter.length; j++) {
				if (word.charAt(i) == letter[j]) {
					sb.append(j + 1);
					break;
				}
			}
		}

		goal = Integer.parseInt(sb.toString());

		return dfs(goal, 0);
	}

	public int dfs(int goal, int current) {
		if (goal == current) {
			isFind = true;
			return 0;
		}
		int count = 1;

		for (int i = 1; !isFind && i <= 5; i++) {
			int temp = current * 10 + i;
            if (temp > 55555)
                continue;
			count += dfs(goal, temp);
		}

		return count;
	}
}