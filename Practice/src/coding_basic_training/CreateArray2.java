package coding_basic_training;

import java.util.LinkedList;
import java.util.List;

public class CreateArray2 {
//	배열 만들기2
	public int[] solution(int l, int r) {
		List<Integer> li = new LinkedList<Integer>();
		for (int i = l; i <= r; i++) {
			String s = String.valueOf(i);
			boolean checked = true;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != '0' && s.charAt(j) != '5') {
					checked = false;
					break;
				}
			}
			if (checked)
				li.add(i);
		}
		return li.size() > 0 ? li.stream().mapToInt(i -> i).toArray() : new int[] { -1 };
//		이진수를 이용한 방법
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
//            if (l <= num && num <= r)
//                list.add(num);
//        }
//
//        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
	}
}