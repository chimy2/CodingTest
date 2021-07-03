package brute_force_search;

import java.util.Arrays;
import java.util.HashSet;

public class FindPrimeNumber {
	HashSet<Integer> hs=new HashSet<Integer>();
	public static void main(String[] args) {
		String numbers="45321";
		int[] arr=new int[numbers.length()];
		boolean[] state=new boolean[numbers.length()];
		int len=1;
		HashSet<Integer> hs=new HashSet<Integer>();
		StringBuffer sb=new StringBuffer(); 
		for(int i=1;i<=numbers.length();i++) {
			len*=i;
			arr[i-1]=i-1;
		}
		for(int i=0;i<len;i++) {
			sb.setLength(0);
			for(int j=0;j<arr.length;j++) {
				sb.append(arr[j]);
			}
			hs.add(Integer.parseInt(sb.toString()));
			int index=arr.length-1;
			while(index>0 && arr[index-1]<arr[index]) {
				state[index]=true;
				index--;
			}
			state[index-1]=true;
			for(int j=index-1;j<=state.length;j++) {
				if(j==index-1) {
					
				}
			}
		}
		System.out.println(hs);
	}
}
