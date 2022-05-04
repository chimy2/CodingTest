package coding_basic_training;

public class SplitBySpace2 {
//	공백으로 구분하기2
	public String[] solution(String my_string) {
		return my_string.trim().split("\\s+");
	}
}