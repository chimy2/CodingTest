package blind_recruitment;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcdede";
		int answer=0;
		int[] ready=new int[s.length()/2];
		String t="",x="",y="";
		int num=1;
		//문자열을 단위별로 잘라 배열에 저장하기
		
		/*스트링 s의 크기를 2로 나눈 수가 압축이 가능한 최대 단위이므로 
		 * 최대 단위 만큼 반복하여 어떤 단위로 압축해야 가장 작은지 배열에 담는다*/
		for(int i=1;i<=s.length()/2;i++) {
			t="";
			num=1;
			for(int j=0;j<s.length()/i-1;j++) {
				x=s.substring(i*j,i*j+i);
				y=s.substring(i*(j+1),i*(j+1)+i);
//				System.out.printf("i=%d, j=%d\n",i,j);
				System.out.printf(x+", "+y+"   ");
				
				/*String s="aabbaccca";
				 * 0-1 1-2 2-3 3-4 .. (n-1)-n n-1개 =8번
				 * 01-23 23-45 45-67 3번비교 +알파 9/2=4-1=3
				 * 012-345 345-678 2번비교 9/3-1=2
				 * 0123-4567 1번비교 +알파 9/4=2-1 1번 비교
				 */
				if(x.equals(y)) {
					num++;
					if(j>=s.length()/i-2) {
						t+=num+y;
						num=1;
					}
				}else {
					if(num>1) {
						t+=num+x;
						num=1;
					}else {
						if(j>=s.length()/i-2) {
							t+=x+y;
							num=1;
						}else {
							t+=x;
						}
					}
				}//모두 자른 크기로 나눈 단어들이 같을때
			}
			//자른 단위에서 남아있는 뒤의 문자열을 붙여줍니다
			/*s가 17개 일때
			 * 1-17 17/1*1=17
			 * 2-16 17/2*2=16
			 * 3-15 17/3*3=15
			 * 4-16 17/4*4=16
			 * 5-15 17/5*5=15
			 * 6-12 17/6*6=12
			 */
			t+=s.substring(s.length()/i*i);
			System.out.println(t);
		}
		
		
		//저장된 배열의 크기를 비교하여 가장 작은 숫자를 반환한다
		System.out.println();
		System.out.println(answer);
	}

}
