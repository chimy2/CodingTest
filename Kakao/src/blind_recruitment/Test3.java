package blind_recruitment;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcdede";
		int answer=0;
		int[] ready=new int[s.length()/2];
		String t="",x="",y="";
		int num=1;
		//���ڿ��� �������� �߶� �迭�� �����ϱ�
		
		/*��Ʈ�� s�� ũ�⸦ 2�� ���� ���� ������ ������ �ִ� �����̹Ƿ� 
		 * �ִ� ���� ��ŭ �ݺ��Ͽ� � ������ �����ؾ� ���� ������ �迭�� ��´�*/
		for(int i=1;i<=s.length()/2;i++) {
			t="";
			num=1;
			for(int j=0;j<s.length()/i-1;j++) {
				x=s.substring(i*j,i*j+i);
				y=s.substring(i*(j+1),i*(j+1)+i);
//				System.out.printf("i=%d, j=%d\n",i,j);
				System.out.printf(x+", "+y+"   ");
				
				/*String s="aabbaccca";
				 * 0-1 1-2 2-3 3-4 .. (n-1)-n n-1�� =8��
				 * 01-23 23-45 45-67 3���� +���� 9/2=4-1=3
				 * 012-345 345-678 2���� 9/3-1=2
				 * 0123-4567 1���� +���� 9/4=2-1 1�� ��
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
				}//��� �ڸ� ũ��� ���� �ܾ���� ������
			}
			//�ڸ� �������� �����ִ� ���� ���ڿ��� �ٿ��ݴϴ�
			/*s�� 17�� �϶�
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
		
		
		//����� �迭�� ũ�⸦ ���Ͽ� ���� ���� ���ڸ� ��ȯ�Ѵ�
		System.out.println();
		System.out.println(answer);
	}

}
