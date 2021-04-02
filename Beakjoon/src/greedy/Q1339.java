package greedy;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Q1339 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		int num=9;
		int answer=0;
		
		for(int i=0;i<n;i++) {
			String s=br.readLine();
			for(int j=0;j<s.length();j++) {
				if(hm.containsKey(s.charAt(j))) {
					hm.put(s.charAt(j), (int) (hm.get(s.charAt(j))+Math.pow(10, s.length()-j-1)));
				}else {
					hm.put(s.charAt(j), (int) Math.pow(10, s.length()-j-1));
				}
			}
		}
		
		List<Entry<Character, Integer>> li=new ArrayList<Entry<Character,Integer>>(hm.entrySet());
		Collections.sort(li, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(Entry<Character, Integer> i:li) {
			answer+=num--*i.getValue();
		}
		
		System.out.println(answer);
	}
}
