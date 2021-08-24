package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9498 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			String result="F";
			if(n>=90) result="A";
			else if(n>=80) result="B";
			else if(n>=70) result="C";
			else if(n>=60) result="D";
			System.out.println(result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
