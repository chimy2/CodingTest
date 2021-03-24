package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Q2941 {
	int index=0;
	int answer=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<String> li=List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
		String s=br.readLine();
		Q2941 q=new Q2941();
		while(q.index<s.length()) {
			if(q.index+1<s.length()) {
				for(int i=0;i<li.size();i++) {
					String element=li.get(i);
					if(element.charAt(0)==s.charAt(q.index) && q.index+element.length()<=s.length()) {
						if(element.substring(1).equals(s.substring(q.index+1, q.index+element.length()))) {
							q.index+=element.length()-1;
							break;
						}
					}
				}
			}
			q.index++;
			q.answer++;
		}
		System.out.println(q.answer);
	}
}
