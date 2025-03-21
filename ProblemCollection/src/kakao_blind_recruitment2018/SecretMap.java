package kakao_blind_recruitment2018;

public class SecretMap {
//	비밀지도
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			String s1 = "0".repeat(n) + Integer.toBinaryString(arr1[i]);
			String s2 = "0".repeat(n) + Integer.toBinaryString(arr2[i]);
			StringBuffer s = new StringBuffer();
			for (int j = 0; j < n; j++) {
				s.append(s1.charAt(s1.length() - n + j) == '1' || s2.charAt(s2.length() - n + j) == '1' ? "#" : " ");
			}
			answer[i] = s.toString();
		}
//		for (int i = 0; i < n; i++) {
//			String s1 = Integer.toBinaryString(arr1[i]);
//			String s2 = Integer.toBinaryString(arr2[i]);
//			String s = "";
//			for (int j = 0; j < n; j++) {
//				boolean check = false;
//				if (s1.length() >= n - j && s1.charAt(s1.length() - n + j) == '1'
//						|| s2.length() >= n - j && s2.charAt(s2.length() - n + j) == '1') {
//					check = true;
//				}
//				s += check ? "#" : " ";
//			}
//			answer[i] = s;
//		}
		return answer;
	}
}
