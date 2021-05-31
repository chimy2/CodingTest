package sort;

public class LargestNumber {
    public String solution(int[] answers) {
        StringBuffer answer=new StringBuffer();
		for(int i=0;i<answers.length;i++) {
			for(int j=0;j<answers.length-i-1;j++) {
				int x=(int) (answers[j]/Math.pow(10, (int)Math.log10(answers[j])));
				int y=(int) (answers[j+1]/Math.pow(10, (int)Math.log10(answers[j+1])));
				if(x>y) {
					int temp=answers[j];
					answers[j]=answers[j+1];
					answers[j+1]=temp;
				}else if(x==y) {
					sort(answers, j);
				}
			}
		}
		for(int i=answers.length-1;i>=0;i--) {
			answer.append(answers[i]);
		}
        return answer.toString();
    }
    
	public int sort(int[] answers, int j) {
		for(int i=1;i<=(int)Math.log10(answers[j])&&i<=(int)Math.log10(answers[j+1]);i++) {
			int x=(int) (answers[j]/Math.pow(10, (int)Math.log10(answers[j])-i));
			int y=(int) (answers[j+1]/Math.pow(10, (int)Math.log10(answers[j+1])-i));
			if(x<y) {
				return 0;
			}else if(y>x) {
				int temp=answers[j];
				answers[j]=answers[j+1];
				answers[j+1]=temp;
				return 0;
			}
		}
		if(Math.log10(answers[j])>Math.log10(answers[j+1])) {
			return 0;
		}
		int temp=answers[j];
		answers[j]=answers[j+1];
		answers[j+1]=temp;
		return 0;
	}
}
