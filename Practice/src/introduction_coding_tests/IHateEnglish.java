package introduction_coding_tests;

public class IHateEnglish {
//	영어가 싫어요
	public long solution(String numbers) {
		String[] nums = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String answer = "";
		String temp = "";
		for (String s : numbers.split("")) {
			temp += s;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i].equals(temp)) {
					answer += i;
					temp = "";
					break;
				}
			}
		}
//        for (int i = 0; i < nums.length; i++) {
//            numbers = numbers.replaceAll(nums[i], String.valueOf(i));
//        }
		return Long.parseLong(answer);
	}
}