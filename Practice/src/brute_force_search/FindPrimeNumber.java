package brute_force_search;

import java.util.Arrays;
import java.util.HashSet;

public class FindPrimeNumber {
//	HashSet<Integer> hs=new HashSet<Integer>();
	public static void main(String[] args) {
		String numbers="45321";
//		int[] arr=new int[numbers.length()];
		String[] arr=numbers.split("");
		boolean[] state=new boolean[numbers.length()];
		int len=1;
//		HashMap<String, Boolean> hm=new HashMap<>();
		HashSet<String> hs=new HashSet<>();
		System.out.println(numbers);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		hs.add(arrToString(arr));
		System.out.println(hs);
//		for(int i=1;i<=numbers.length();i++) {
//			len*=i;
//			arr[i-1]=i-1;
//		}
//		for(int i=0;i<len;i++) {
//			sb.setLength(0);
//			for(int j=0;j<arr.length;j++) {
//				sb.append(arr[j]);
//			}
//			hs.add(Integer.parseInt(sb.toString()));
//			int index=arr.length-1;
//			while(index>0 && arr[index-1]<arr[index]) {
//				state[index]=true;
//				index--;
//			}
//			state[index-1]=true;
//			for(int j=index-1;j<=state.length;j++) {
//				if(j==index-1) {
//					
//				}
//			}
//		}
		System.out.println(hs);
	}
	
	public static void permutation(String[] arr, HashSet<String> hs) {
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i].compareTo(arr[i+1])<=0) continue;
			String s="";
			for(int j=arr.length-1;j>i;j--) {
				if(arr[i].compareTo(arr[j])!=0) {
					swap(arr, i, j);
					break;
				}
			}
			for(int j=i+1;j<arr.length;j++) {
				swap(arr, j, arr.length-1);
			}
			break;
		}
		hs.add(arrToString(arr));
	}
	
	public static void swap(String[] arr, int i, int j) {
		String s=arr[i];
		arr[i]=arr[j];
		arr[j]=s;
	}
	
	public static String arrToString(String[] arr) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
