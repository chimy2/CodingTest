package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q3040 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Integer> li=new ArrayList<Integer>();
		int small=0;
		int large=1;
		
		for(int i=0;i<9;i++) {
			li.add(Integer.parseInt(br.readLine()));
		}
		while(true) {
			int sum=0;
			for(int i=0;i<9;i++) {
				if(i!=small && i!=large) sum+=li.get(i);
			}
			if(sum==100) break;
			else if(large==8) {
				small++;
				large=small+1;
			}else {
				large++;
			}
		}
		for(int i=0;i<9;i++) {
			if(i!=small && i!=large) System.out.println(li.get(i));
		}
	}
}
