package blind_recruitment;

import java.util.regex.*;

public class Test3 {
	public static void main(String[] args) {
		String s="pPoooyY";
		Matcher matcher = Pattern.compile("[pP]").matcher(s);
        int a=0;
		while(matcher.find()) a++;
		matcher=Pattern.compile("[yY]").matcher(s);
		while(matcher.find()) a--;
		System.out.println(a==0?true:false);
		//��°�� : test
    }
}