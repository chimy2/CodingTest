package blind_recruitment;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,4,4,3,3};
		int[] answer={arr[0]};
		int num=0;
		
		for(int i=1;i<arr.length;i++) {
			System.out.println("answer="+answer[num]+", arr="+arr[i]);
			if(answer[num]!=arr[i]) {
				answer=Arrays.copyOf(answer, answer.length+1);
				answer[++num]=arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
