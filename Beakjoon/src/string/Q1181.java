package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Q1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<num;i++) {
			hs.add(br.readLine());
		}
		List<String> li=new ArrayList<String>(hs);
		Comparator<String> compareString=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length()-o2.length();
				}
			}
		};
		Collections.sort(li, compareString);
		li.forEach((element)->System.out.println(element));
	}
}
