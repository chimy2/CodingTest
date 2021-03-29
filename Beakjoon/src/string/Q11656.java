package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11656 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		List<String> li=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			li.add(s.substring(i));
		}
		Collections.sort(li);
		for(String i:li) {
			System.out.println(i);
		}
	}
}
