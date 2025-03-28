package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 과제 진행하기
public class ProgressingAssignments {
	public String[] solution(String[][] plans) {
		int n = plans.length;
		String[] answer = new String[n];

		Stack<Task> remain = new Stack<Task>();
		List<Task> li = new ArrayList<Task>();

		for (int i = 0; i < n; i++) {
			String[] temp = plans[i][1].split(":");

			int start = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
			int playTime = Integer.parseInt(plans[i][2]);

			Task t = new Task(plans[i][0], start, playTime);

			li.add(t);
		}

		li.sort((o1, o2) -> o1.start - o2.start);

		Task current = null;

		int idx = 0;

		for (int time = 0, i = 0; time < 60 * 24 && i < n; time++) {
			if (current != null) {
				current.playTime--;
				if (current.playTime == 0) {
					answer[idx++] = current.name;
					current = remain.isEmpty() ? null : remain.pop();
				}
			}

			if (time == li.get(i).start) {
				if (current != null) {
					remain.add(current);
				}

				current = li.get(i++);
			}

		}

		if (current != null) {
			answer[idx++] = current.name;
		}

		while (!remain.isEmpty()) {
			answer[idx++] = remain.pop().name;
		}

		return answer;
	}

	class Task {
		private String name;
		private int start;
		private int playTime;

		public Task(String name, int start, int playTime) {
			this.name = name;
			this.start = start;
			this.playTime = playTime;
		}

		@Override
		public String toString() {
			return "Task [name=" + name + ", start=" + start + ", playTime=" + playTime + "]";
		}

	}
}