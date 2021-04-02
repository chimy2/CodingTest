package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2217 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int su=0;
		int max=0;
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			li.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(li);
		for(int i=n-1;i>=0;i--) {
			if(max==0 || li.get(i)*(n-i)>max*su){
				max=li.get(i);
				su=(n-i);
			} else if(max<li.get(i)) {
				su=(n-i);
			}
		}
		System.out.println(max*su);
	}
}
