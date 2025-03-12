package programmers_codechallenge2025_round1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// 유연근무제
public class FlexibleWorkingHours {

	public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = 0;

		for (int i = 0; i < schedules.length; i++) {
			int count = 0;

			LocalTime localTime = LocalTime.of(schedules[i] / 100, schedules[i] % 100);
			int time = Integer.parseInt(localTime.plusMinutes(10).format(DateTimeFormatter.ofPattern("hhmm")));

			for (int j = 0; j < 7; j++) {
				if ((startday + j) % 7 == 0 || (startday + j) % 7 == 6) {
					continue;
				}

				if (timelogs[i][j] <= time)
					count++;
			}

			if (count >= 5)
				answer++;
		}

		return answer;
	}
}