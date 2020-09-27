package exercise;

public class DigitPlus {
    public int solution(int n) {
        char[] a=String.valueOf(n).toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=Integer.parseInt(String.valueOf(a[i]));
		}
        return sum;
    }
}
