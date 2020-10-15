package exercise;

public class NumberOfCountry124 {
    public String solution(long n) {
        StringBuffer sb=new StringBuffer();
		while(n>0){
			switch((int)n%3) {
			case 0:
				n=(n-1)/3;
				sb.append(4);
				break;
			case 1:
				n=(n-1)/3;
				sb.append(1);
				break;
			case 2:
				n=(n-1)/3;
				sb.append(2);
			}
		}
		for(int i=0;i<sb.length()/2;i++) {
			String temp=sb.substring(i, i+1);
			sb.replace(i, i+1, sb.substring(sb.length()-i-1,sb.length()-i));
			sb.replace(sb.length()-i-1, sb.length()-i, temp);
		}
        return sb.toString();
    }
}
