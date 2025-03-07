package pccp_past_exam_question;

// [PCCP 기출문제] 1번 / 붕대 감기
public class BandageWrapping {

	public int solution(int[] bandage, int health, int[][] attacks) {
		int remain = health;

		for (int i = 0, playTime = 0, magicTime = 0; i < attacks.length && remain > 0; playTime++) {

			if (playTime == attacks[i][0]) {
				remain -= attacks[i++][1];
				magicTime = 0;
			} else if (remain == health) {
				magicTime = 0;
			} else if (bandage[0] == 1 || magicTime == bandage[0] - 1) {
				magicTime = 0;
				remain = Math.min(health, remain + bandage[1] + bandage[2]);
			} else {
				magicTime++;
				remain = Math.min(health, remain + bandage[1]);
			}
		}

		return remain > 0 ? remain : -1;
	}
}