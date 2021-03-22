package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11721 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().replaceAll("(.{10})", "$1\n"));
	}
}
