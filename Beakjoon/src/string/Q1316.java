package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int answer=0;
		for(int i=0;i<num;i++) {
			String s=br.readLine();
			List li=new ArrayList();
			char last=' ';
			for(int j=0;j<s.length();j++) {
				char c=s.charAt(j);
				if(!li.contains(c)) {
					li.add(c);
					last=c;
				}else if(last!=c) {
					break;
				}
				if(j==s.length()-1) answer++;
			}
		}System.out.println(answer);
	}
}
