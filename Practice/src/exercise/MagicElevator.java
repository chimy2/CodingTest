package exercise;

//	마법의 엘리베이터
public class MagicElevator {

	public int solution(int storey) {
		return dfs(storey, 0, false);
	}

	public int dfs(int val, int count, boolean isLast) {
		if (val == 0) {
			return count;
		}

		int div = val / 10;
		int mod = val % 10;

		if (isLast) {
			return dfs(div, count + mod, isLast);
		} else {
			return Math.min(dfs(div, count + mod, isLast), dfs(div + 1, count + 10 - mod, val < 10 ? true : isLast));
		}
	}
}