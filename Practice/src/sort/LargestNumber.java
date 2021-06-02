package sort;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String solution(int[] answers) {
    	StringBuffer sb=new StringBuffer();
    	int len=Arrays.toString(answers).length();
    	String[] arr=Arrays.toString(answers).substring(1, len-1).split(", ");
    	Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
    	});
    	if(arr[0].equals("0")) return "0";
    	for(int i=0;i<arr.length;i++) {
    		sb.append(arr[i]);
    	}
        return sb.toString();
    }
}
