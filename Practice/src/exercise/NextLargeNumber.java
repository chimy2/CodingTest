package exercise;

public class NextLargeNumber {

    public int solution(int n) {
	    String s=Integer.toBinaryString(n);
	    int num=0;
	    int check=0;
	    for(int i=0;i<s.length();i++) {
	    	if(s.charAt(i)=='1') num++; 
	    }
	    while(num!=check) {
	    	check=0;
	    	n++;
	    	s=Integer.toBinaryString(n);
	    	for(int i=0;i<s.length();i++) {
		    	if(s.charAt(i)=='1') check++; 
	    	}
	    }
        return n;
    }
}
