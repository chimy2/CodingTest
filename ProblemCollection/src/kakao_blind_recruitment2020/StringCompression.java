package blind_recruitment;

public class StringCompression {
	public int solution(String s) {
		int answer=0;
		int[] ready=new int[s.length()/2];
		String t="", x="", y="";
		int num=1,end=0;
		//���ڿ��� �������� �߶� �迭�� �����ϱ�
		
		/*��Ʈ�� s�� ũ�⸦ 2�� ���� ���� ������ ������ �ִ� �����̹Ƿ� 
		 * �ִ� ���� ��ŭ �ݺ��Ͽ� � ������ �����ؾ� ���� ������ �迭�� ��´�*/
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
				}//�ڸ� �������� �����ִ� ���� ���ڿ��� �ٿ��ݴϴ�
				t+=s.substring(s.length()/i*i);
				ready[i-1]=t.length();
			}//����� �迭�� ũ�⸦ ���Ͽ� ���� ���� ���ڸ� ��ȯ�Ѵ�
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