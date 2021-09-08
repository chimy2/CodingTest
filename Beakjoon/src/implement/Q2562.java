package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2562 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int max=0;
			int index=0;
			for(int i=1;i<=9;i++) {
				int current=Integer.parseInt(br.readLine());
				if(current>max) {
					max=current;
					index=i;
				}
			}
			System.out.println(max+"\n"+index);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
