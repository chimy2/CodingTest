package blind_recruitment;

public class StringCompression {
	public int solution(String s) {
		int answer=0;
		int[] ready=new int[s.length()/2];
		String t="", x="", y="";
		int num=1,end=0;
		//문자열을 단위별로 잘라 배열에 저장하기
		
		/*스트링 s의 크기를 2로 나눈 수가 압축이 가능한 최대 단위이므로 
		 * 최대 단위 만큼 반복하여 어떤 단위로 압축해야 가장 작은지 배열에 담는다*/
		if(s.length()>1) {
			for(int i=1;i<=s.length()/2;i++) {
				t="";
				num=1;
				for(int j=0;j<s.length()/i-1;j++) {
					x=s.substring(i*j,i*j+i);
					y=s.substring(i*(j+1),i*(j+1)+i);
					end=s.length()/i-2;
					if(x.equals(y)) {
						num++;
						if(j>=end) {
							t+=num+y;
							num=1;
						}
					}else {
						if(num>1) {
							if(j>=end) {
								t+=num+x+y;
								num=1;
							}else {
								t+=num+x;
								num=1;
							}
						}else {
							if(j>=end) {
								t+=x+y;
								num=1;
							}else {
								t+=x;
							}
						}
					}
				}//자른 단위에서 남아있는 뒤의 문자열을 붙여줍니다
				t+=s.substring(s.length()/i*i);
				ready[i-1]=t.length();
			}//저장된 배열의 크기를 비교하여 가장 작은 숫자를 반환한다
			answer=ready[0];
			for(int i=1;i<ready.length;i++) {
				if(answer>ready[i]) answer=ready[i];
			}
		}else {
			answer=1;
		}
		return answer;
	}
}