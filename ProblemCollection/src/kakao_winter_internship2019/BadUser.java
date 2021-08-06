package kakao_winter_internship2019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadUser {
	public static void main(String[] args) {
		String[] user_id= {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id= {"fr*d*", "abc1**"};
		int[] arr=new int[banned_id.length];
		int answer=1;
		for(int i=0;i<banned_id.length;i++) {
			banned_id[i]=banned_id[i].replaceAll("\\*", "(\\\\w)");
			for(int j=0;j<user_id.length;j++) {
				Matcher m=Pattern.compile(banned_id[i]).matcher(user_id[j]);
				if(m.find() && m.group().equals(user_id[j])) {
					arr[i]++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			answer*=arr[i];
		}
		System.out.println(answer);
	}
}
