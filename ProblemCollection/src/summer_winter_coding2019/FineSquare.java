package summer_winter_coding2019;

public class FineSquare {
	public long solution(int w,int h) {
        long answer=(long)w*h-(w+h);
        int gcd=1;
        for(int i=2;i<=w&&i<=h;){
            if(w%i==0 && h%i==0) {
                w/=i;
                h/=i;
                gcd*=i;
            } else i++;
        }
		return answer+gcd;
	}
}
