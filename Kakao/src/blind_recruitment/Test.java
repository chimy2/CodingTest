package blind_recruitment;

import java.util.Scanner;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] answer=new int[19][19];
		int[][] answer2= {{2,3},{3,2}};
		//"{"+"0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0 0 0 0".replaceAll(" ", ", ")+"}"
//		for(int i=0;i<Math.pow(answer.length, 2);i++) {
//			answer[i/9][i%9]=sc.nextInt();
//		}System.out.println(Arrays.toString(answer));
//		int len=Integer.parseInt(sc.nextLine());
//		for(int i=0;i<len;i++) {
//			answer[sc.nextInt()-1][sc.nextInt()-1]++;
//		}
//		for(int i=0;i<answer.length;i++) {
//			for(int j=0;j<answer[i].length;j++) {
//				System.out.printf("%d ",answer[i][j]);
//			}System.out.println();
//		}
		String s="aa1234";
		boolean d=true;
		for(char a:s.toCharArray()) {System.out.println(a);
			if(a<48||a>57) {
				d=false;break;
			}
		}System.out.println(d);
	}
}
