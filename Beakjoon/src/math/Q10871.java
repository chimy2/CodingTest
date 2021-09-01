package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10871 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			String[] n=br.readLine().split(" ");
			int x=Integer.parseInt(s[1]);
			for(int i=0;i<Integer.parseInt(s[0]);i++) {
				int a=Integer.parseInt(n[i]);
				if(x>a) {
					System.out.printf("%d ", a);
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
