package pcce_past_exam_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// [PCCE 기출문제] 10번 / 데이터 분석
public class DataAnalysis {

	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		List<int[]> answer = new ArrayList<int[]>();
		int indexExt = getIndex(ext);
		int indexSortBy = getIndex(sort_by);

		for (int i = 0; i < data.length; i++) {
			if (data[i][indexExt] < val_ext) {
				answer.add(data[i]);
			}
		}

		Collections.sort(answer, (o1, o2) -> o1[indexSortBy] - o2[indexSortBy]);

		return answer.toArray(new int[answer.size()][]);
	}

	public int getIndex(String standard) {
		int index = -1;

		switch (standard) {
		case "code":
			index = 0;
			break;
		case "date":
			index = 1;
			break;
		case "maximum":
			index = 2;
			break;
		case "remain":
			index = 3;
			break;
		}
		return index;
	}
}
