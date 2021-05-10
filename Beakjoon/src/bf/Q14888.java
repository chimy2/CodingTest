package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14888 {
	static int max=-1000000000;
	static int min=1000000000;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		int[] count=new int[4];
		int[] state=new int[num-1];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) {
			count[i]=Integer.parseInt(st.nextToken());
		}
//		for(int i=0,j=0;i<4&&j<num;) {
//			if(count[i]==0) i++;
//			else {
//				count[i]--;
//				state[j++]=i;
//			}
//		}
		bf(arr, count, arr[0], 0);
		System.out.println(max+"\n"+min);
		System.out.println(Arrays.toString(state));
	}
	private static void bf(int[] arr, int[] count, int result, int index) {
		if(index==arr.length) {
			if(max<result) max=result;
			if(min>result) min=result;
		}
		for(int i=0;i<4;i++) {
			
		}
	}
}
