package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2741 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			StringBuffer result=new StringBuffer();
			for(int i=1;i<=n;i++) {
				if(i!=1) result.append("\n");
				result.append(i);
			}
			System.out.println(result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
