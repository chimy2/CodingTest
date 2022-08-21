package introduction_coding_tests;

public class RemoveDuplicateCharacters {
//	중복된 문자 제거
	public String solution(String my_string) {
		String answer = "";
		for (String i : my_string.split("")) {
			if (!answer.contains(i))
				answer += i;
		}
		return answer;
//		return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
//		return my_string.chars().mapToObj(Character::toString).distinct().collect(Collectors.joining());
	}
}