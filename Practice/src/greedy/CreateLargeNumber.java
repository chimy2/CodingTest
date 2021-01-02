package greedy;

public class CreateLargeNumber {//큰 수 만들기

    public String solution1(String number, int k) {
        //83.3 / 100.0
    	String answer="";
		boolean check=true;
		char ch=number.charAt(0);
		for(int i=1;i<number.length();i++) {
			if(ch!=number.charAt(i)) check=false;
		}
		if(check) {
			number=number.substring(k);
		}else {
			for(int i=0;i<number.length()-1;i++) {
				if(Character.getNumericValue(number.charAt(i))==9) continue;
				for(int j=i+1;j<k+i+1&&j<number.length();j++) {
					if(number.charAt(i)<number.charAt(j)) {
						number=number.substring(0,i)+number.substring(i+1);
						i--;
						k--;
						break;
					}
				}
			}
		}
        return number;
    }
}
