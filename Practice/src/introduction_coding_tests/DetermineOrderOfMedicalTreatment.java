package introduction_coding_tests;

public class DetermineOrderOfMedicalTreatment {
//	진료순서 정하기
	public int[] solution(int[] emergency) {
		boolean[] arr = new boolean[100];
		for (int i : emergency) {
			arr[i - 1] = true;
		}
		for (int i = 0; i < emergency.length; i++) {
			int count = 0;
			for (int j = arr.length - 1; j >= emergency[i]; j--) {
				if (arr[j])
					count++;
			}
			emergency[i] = count;
		}
		return emergency;
//		return Arrays.stream(emergency).map(
//				i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i)
//						+ 1)
//				.toArray();
	}
}