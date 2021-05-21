package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q14500 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<8;i++) {
			li.add(i+1);
		}
		System.out.println(li);
		System.out.println(li);
	}
}
