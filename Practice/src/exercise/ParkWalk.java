package exercise;

public class ParkWalk {
//	공원 산책
	public int[] solution(String[] park, String[] routes) {
		int[] answer = { 0, 0 };
		int lenI = park.length;
		int lenJ = park[0].length();
		for (int i = 0; i < park.length; i++) {
			int j = park[i].indexOf("S");
			if (j != -1) {
				for (String r : routes) {
					char direction = r.charAt(0);
					int distance = r.charAt(2) - 48;
					switch (direction) {
					case 'E':
						if (j + distance < lenJ) {
							for (int k = 1; k <= distance; k++) {
								if (park[i].charAt(j + k) == 'X')
									break;
								if (distance == k) {
									j += distance;
								}
							}
						}
						break;
					case 'W':
						if (j >= distance) {
							for (int k = 1; k <= distance; k++) {
								if (park[i].charAt(j - k) == 'X')
									break;
								if (distance == k) {
									j -= distance;
								}
							}
						}
						break;
					case 'S':
						if (i + distance < lenI) {
							for (int k = 1; k <= distance; k++) {
								if (park[i + k].charAt(j) == 'X')
									break;
								if (distance == k) {
									i += distance;
								}
							}
						}
						break;
					case 'N':
						if (i >= distance) {
							for (int k = 1; k <= distance; k++) {
								if (park[i - k].charAt(j) == 'X')
									break;
								if (distance == k) {
									i -= distance;
								}
							}
						}
					}
				}
				answer[0] = i;
				answer[1] = j;
				break;
			}
		}
		return answer;
	}
}