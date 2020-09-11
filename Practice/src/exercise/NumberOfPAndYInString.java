package exercise;

import java.util.regex.*;

public class NumberOfPAndYInString {
    boolean solution(String s) {
		Matcher matcher = Pattern.compile("[pP]").matcher(s);
        int a=0;
		while(matcher.find()) a++;
		matcher=Pattern.compile("[yY]").matcher(s);
		while(matcher.find()) a--;
        return a==0?true:false;
    }
}
