package coding_basic_training;

public class NationalQualifyingExam {
//	전국 대회 선발 고사
	public int solution(int[] rank, boolean[] attendance) {
		int answer = 0;
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0;;) {
				if (num != rank[j]) {
					j++;
				} else if (attendance[j]) {
					answer += Math.pow(10, 4 - i * 2) * j;
					num++;
					break;
				} else {
					j = 0;
					num++;
				}
			}
		}
		return answer;
//		return IntStream.range(0, rank.length).filter(i -> attendance[i]).boxed()
//				.sorted(Comparator.comparing(i -> rank[i])).limit(3L).reduce((current, next) -> current * 100 + next)
//				.get();
	}
}