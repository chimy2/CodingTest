package introduction_coding_tests;

public class SwapIndexes {
//	인덱스 바꾸기
	public String solution(String my_string, int num1, int num2) {
		return my_string.substring(0, num1) + my_string.charAt(num2) + my_string.substring(num1 + 1, num2)
				+ my_string.charAt(num1) + my_string.substring(num2 + 1);
//        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
//        Collections.swap(list, num1, num2);
//        return String.join("", list);
	}
}