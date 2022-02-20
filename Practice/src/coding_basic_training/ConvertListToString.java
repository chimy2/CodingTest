package coding_basic_training;

public class ConvertListToString {
//	문자 리스트를 문자열로 변환하기
	public String solution(String[] arr) {
		return String.join("", arr);
//		stream을 이용한 방법
//		return Arrays.stream(arr).collect(Collectors.joining());
	}
}
