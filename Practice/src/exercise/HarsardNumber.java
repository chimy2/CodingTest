package exercise;

public class HarsardNumber {
    public boolean solution(int x) {
        char[] a=String.valueOf(x).toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=Integer.parseInt(String.valueOf(a[i]));
		}
        return x%sum==0?true:false;
    }
}
