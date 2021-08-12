package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1000 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] arr=br.readLine().split(" ");
			System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
