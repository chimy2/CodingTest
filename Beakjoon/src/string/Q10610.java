package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Q10610 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<10;i++) {
			hm.put(Character.forDigit(i, 10), 0);
		}
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		}
		for(Entry<Character, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+", "+e.getValue());
		}
	}
}
