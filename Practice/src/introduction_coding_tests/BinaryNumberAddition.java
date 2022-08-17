package introduction_coding_tests;

public class BinaryNumberAddition {
//	이진수 더하기
	public String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.valueOf(bin1, 2) + Integer.valueOf(bin2, 2));
	}
}