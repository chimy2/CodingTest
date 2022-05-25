package coding_basic_training;

public class RemoveLeadingZeros {
//	0 떼기
	public String solution(String n_str) {
		return n_str.chars().mapToObj(Character::toString).reduce("",
				(x, y) -> x.equals("") && y.equals("0") ? x : x + y);
//        return ""+Integer.parseInt(n_str);
	}
}