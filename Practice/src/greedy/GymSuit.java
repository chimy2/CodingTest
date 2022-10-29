package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GymSuit {
//	체육복
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		List<Integer> reserves = new ArrayList<Integer>();
		List<Integer> losts = new ArrayList<Integer>();
		for (Integer i : reserve) {
			reserves.add(i);
		}
		for (Integer i : lost) {
			if (reserves.contains(i)) {
				reserves.remove(i);
			} else {
				losts.add(i);
			}
		}
		Collections.sort(losts);
		for (Integer i : losts) {
			if (reserves.contains(Integer.valueOf(i - 1))) {
				reserves.remove(Integer.valueOf(i - 1));
			} else if (reserves.contains(Integer.valueOf(i + 1))) {
				reserves.remove(Integer.valueOf(i + 1));
			} else {
				answer--;
			}
		}
		return answer;

//		int answer = n;
//		int[] check = new int[n + 2];
//		for (int i:reserve) {
//			check[i]++;
//		}
//		for (int i : lost) {
//			check[i]--;
//		}
//		for (int i = 1; i <= n; i++) {
//            if(check[i]==-1){
//                if(check[i-1]==1){
//                    continue;
//                } else if(check[i+1]==1){
//                    check[i+1]--;
//                } else {
//                    answer--;
//                }
//            }
//		}
//		return answer;

//		문제 리뉴얼 전
//		int answer = 0;
//		boolean[] check = new boolean[n + 1];
//		for (int i = 0; i < check.length; i++) {
//			check[i] = true;
//		}
//		for (int i : lost) {
//			check[i] = false;
//		}
//		for (int i = 0; i < reserve.length; i++) {
//			if (!check[reserve[i]]) {
//				check[reserve[i]] = true;
//				reserve[i] = 0;
//			}
//		}
//		for (int i = 0; i < reserve.length; i++) {
//			if (reserve[i] == 0)
//				continue;
//			else if (reserve[i] == 1) {
//				if (!check[reserve[i] + 1]) {
//					check[reserve[i] + 1] = true;
//					reserve[i] = 0;
//				}
//			} else if (reserve[i] == n) {
//				if (!check[reserve[i] - 1]) {
//					check[reserve[i] - 1] = true;
//					reserve[i] = 0;
//				}
//			} else if (!check[reserve[i] - 1]) {
//				check[reserve[i] - 1] = true;
//				reserve[i] = 0;
//			} else if (!check[reserve[i] + 1]) {
//				check[reserve[i] + 1] = true;
//				reserve[i] = 0;
//			}
//		}
//		for (int i = 1; i < check.length; i++) {
//			if (check[i])
//				answer++;
//		}
//		return answer;
	}
}