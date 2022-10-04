package exercise;

import java.util.stream.Collectors;

public class CaesarCipher {
	public String solution(String s, int n) {
		return s.chars().mapToObj(i -> {
			if (i >= 97) {
				return Character.toString((i + n - 97) % 26 + 97);
			} else if (i >= 65) {
				return Character.toString((i + n - 65) % 26 + 65);
			} else {
				return " ";
			}
		}).collect(Collectors.joining());
//        char c;
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<s.length();i++) {
//            c=s.charAt(i);
//            if(c==' ') sb.append(c);
//            else if(c/97==0) sb.append((char)((c+n)/91>0?(c+n)%90+64:(c+n-1)%90+1));
//            else sb.append((char)((c+n)/123>0?(c+n)%122+96:(c+n-1)%122+1));
//        }
//        return sb.toString();
	}
}
