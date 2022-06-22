package introduction_coding_tests;

import java.util.ArrayList;

public class FindModeValue {
//	최빈값 구하기
	public int solution(int[] array) {
		int answer = -1;
		boolean[] arr = new boolean[1000];
		ArrayList<Integer> li = new ArrayList<Integer>();

		for (int i : array) {
			li.add(i);
			arr[i] = true;
		}
		while (li.size() > 1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]) {
					li.remove(Integer.valueOf(i));
					if (li.indexOf(i) < 0)
						arr[i] = false;
				}
			}
		}
		if (li.size() == 1) {
			answer = li.get(0);
		}

//        int maxCount = 0;
//        int answer = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int number : array){
//            int count = map.getOrDefault(number, 0) + 1;
//            if(count > maxCount){
//                maxCount = count;
//                answer = number;
//            }
//            else  if(count == maxCount){
//                answer = -1;
//            }
//            map.put(number, count);
//        }
		return answer;
	}
}