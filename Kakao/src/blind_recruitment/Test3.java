package blind_recruitment;

import java.util.*;
import java.util.regex.*;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		int i=0;
		while(i<r*g*b) {
			
			System.out.printf("%d %d %d\n",r,i%(i%b+1),i%b);
			i++;
		}System.out.println(i);
	}
}