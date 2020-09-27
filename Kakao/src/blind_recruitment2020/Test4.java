package blind_recruitment;

import java.util.*;

public class Test4{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int[] answer;
		List<Integer> ls1=List.of(1,3,4,5);
		List<Integer> ls2=List.of(3,1,2,4,5);
		List<Integer> x=Arrays.asList(0,0,0);
		byte sum=0;
		int a=0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==i%5+1)x.set(0, x.get(0)+1);
			if(i%2==0) {if(answers[i]==2) x.set(1, x.get(1)+1);}
			else {if(answers[i]==ls1.get((i/2)%4))x.set(1, x.get(1)+1);}
			if(answers[i]==ls2.get(i/2%5))x.set(2, x.get(2)+1);
			if(i%2==0) System.out.printf("i=%d, answers[i]=%d %d=%d , %d=%d, %d=%d\n",i,answers[i],i%5+1,x.get(0),2,x.get(1),ls2.get(i/2%5),x.get(2));
			else System.out.printf("i=%d, answers[i]=%d %d=%d , %d=%d, %d=%d\n",i,answers[i],i%5+1,x.get(0),ls1.get((i/2)%4),x.get(1),ls2.get(i/2%5),x.get(2));
		}
		for(int i:x) if(i!=0) sum++;
		answer=new int[sum];System.out.printf("x=%d, y=%d, z=%d\n",x.get(0).intValue(),x.get(1).intValue(),x.get(2).intValue());
		
		for(int i=0;i<answer.length;i++) {
			a=Math.max(Math.max(x.get(0), x.get(1)), x.get(2));
			answer[i]=x.indexOf(a)+1;
			x.set(x.indexOf(a), -1);
		}
		System.out.printf("x=%d, y=%d, z=%d\n",x.get(0).intValue(),x.get(1).intValue(),x.get(2).intValue());
		System.out.printf(Arrays.toString(answer));
	}
}
