package monthly_code_challenge_season2;

public class NoMoreThanTwoDifferentBits {
//	100.0 / 100.0
    public long[] solution2(long[] numbers) {
		long[] answer=new long[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) answer[i]=numbers[i]+1;
			else {
				StringBuilder sb=new StringBuilder(Long.toBinaryString(numbers[i]));
				int index=sb.lastIndexOf("0");
				if(index!=-1) {
					if(sb.indexOf("1", index)!=-1) {
						sb.setCharAt(sb.indexOf("1", index), '0');
					}
					sb.setCharAt(index, '1');
				} else {
                    sb.append('1');
					sb.setCharAt(1, '0');
				}
                answer[i]=Long.parseLong(sb.toString(), 2);
			}
		}
        return answer;
    }
	
//	81.8 / 100.0
    public long[] solution(long[] numbers) {
		long[] answer=new long[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			String origin=Long.toBinaryString(numbers[i]);
			for(long j=numbers[i]+1;;j++) {
				String s=Long.toBinaryString(j);
				int count=s.length()-origin.length();
				for(int k=0;k<origin.length()&&count<3;k++) {
					if(s.charAt(s.length()-k-1)!=origin.charAt(origin.length()-k-1)) count++;
				}
				if(count<=2) {
					answer[i]=Long.parseLong(s, 2);
					break;
				}
			}
		}
        return answer;
    }
}
