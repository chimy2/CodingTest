package pccp_past_exam_question;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// [PCCP 기출문제] 1번 / 동영상 재생기
public class VideoPlayer {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		LocalTime min = LocalTime.of(0, 0);
		LocalTime max = convertToTime(video_len);
		LocalTime time = convertToTime(pos);
		LocalTime startTime = convertToTime(op_start);
		LocalTime endTime = convertToTime(op_end);

		if (time.compareTo(startTime) >= 0 && time.compareTo(endTime) <= 0) {
			time = endTime;
		}

		for (String command : commands) {
			if (command.equals("prev")) {

				if (time.minusSeconds(10).getHour() == 23) {
					time = min;
				} else {
					time = time.minusSeconds(10);
				}
			} else {
				if (time.plusSeconds(10).compareTo(max) > 0) {
					time = max;
				} else {
					time = time.plusSeconds(10);
				}
			}

			if (time.compareTo(startTime) >= 0 && time.compareTo(endTime) <= 0) {
				time = endTime;
			}
		}

		return time.format(DateTimeFormatter.ofPattern("mm:ss"));
	}

	public LocalTime convertToTime(String time) {
		String[] arr = time.split(":");
		return LocalTime.of(0, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
	}
}