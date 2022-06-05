package coding_basic_training;

public class EnlargePicture {
//	그림 확대
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		for (int i = 0; i < picture.length; i++) {
			String temp = "";
			for (char c : picture[i].toCharArray()) {
				temp += ("" + c).repeat(k);
			}
			for (int j = 0; j < k; j++) {
				answer[k * i + j] = temp;
			}
		}
		return answer;
	}
}