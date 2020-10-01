package exercise;

import java.util.Scanner;

public class RectanguleStarShooting {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
			System.out.println("*".repeat(a).concat("\n").repeat(b));
	        // for(int i=0;i<b;i++){
	        //     System.out.println("*".repeat(a));
	        // }
			sc.close();
	    }
}
