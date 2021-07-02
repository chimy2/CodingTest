package kakao_blind_recruitment2021;

import java.util.ArrayList;
import java.util.List;

public class MenuRenewal {
	List<String> li=new ArrayList<String>();
	public static void main(String[] args) {
		String[] orders= {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course= {2,3,4};
		List<String> li=new ArrayList<String>();
		for(int i=0;i<course.length;i++) {
			for(int j=0;j<orders.length-1;j++) {
				if(orders[j].length()<course[i]) continue;
				String order=orders[j].substring(0, course[i]);
//				recursion(orders, orders[j].substring(0, course[i]), j);
				do {
					System.out.println(order);
					operation(orders, order);
//					order=
				} while(order.charAt(0)==orders[j].charAt(orders[j].length()-order.length()));
			}
		}
		System.out.println(li.toArray(String[]::new));
	}
//	public static void recursion(String[] orders, String order, int j) {
//		System.out.println(order);
//		do {
//			operation(orders, order);
//			
//		} while(order.charAt(0)==orders[j].charAt(orders[j].length()-order.length()));
//	}
	private static void operation(String[] orders, String order) {
		// TODO Auto-generated method stub
		
	}
}
