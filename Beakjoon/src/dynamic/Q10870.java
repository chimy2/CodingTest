package dynamic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q10870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		List<Integer> li=new ArrayList<Integer>();
		li.add(0);
		li.add(1);
		while(li.size()<=num){
			li.add(li.get(li.size()-2)+li.get(li.size()-1));
		}
		System.out.println(li.get(num));
	}
}
