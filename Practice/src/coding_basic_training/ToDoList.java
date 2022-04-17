package coding_basic_training;

import java.util.ArrayList;

public class ToDoList {
//	할 일 목록
	public String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> li = new ArrayList<String>();
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i])
				li.add(todo_list[i]);
		}
		return li.stream().toArray(String[]::new);
	}
}