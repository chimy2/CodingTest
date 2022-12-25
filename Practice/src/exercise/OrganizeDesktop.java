package exercise;

public class OrganizeDesktop {
//	바탕화면 정리
	public int[] solution(String[] wallpaper) {
		int[] answer = { 51, 51, 0, 0 };
		for (int i = 0; i < wallpaper.length; i++) {
			int l = wallpaper[i].indexOf('#');
			int r = wallpaper[i].lastIndexOf('#') + 1;
			answer[1] = Math.min(answer[1], l > -1 ? l : 51);
			answer[3] = Math.max(answer[3], r);
			if (l + r > -1) {
				answer[0] = Math.min(answer[0], i);
				answer[2] = Math.max(answer[2], i + 1);
			}
		}
		return answer;
	}
}