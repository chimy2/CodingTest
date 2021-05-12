package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10971 {
	static int min;
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[][] arr=new int[num][num];
		boolean[] state=new boolean[num];
		for(int i=0;i<num;i++) {
			StringTokenizer s=new StringTokenizer(br.readLine());
			for(int j=0;j<num;j++) {
				arr[i][j]=Integer.parseInt(s.nextToken());
				min+=arr[i][j];
			}
		}
		for(int i=0;i<num;i++) {
			state[i]=true;
			bf(arr, state, i, i, 0);
			state[i]=false;
		}
//		bf(arr, state, 0, 0, 0);
		System.out.println(min);
	}
	
	private static void bf(int[][] arr, boolean[] state, int start, int index, int result) {
//		try {
		if(index==arr.length && arr[index-1][start]!=0) {
			result+=arr[index-1][start];
			for(int i=0;i<state.length;i++) {
				System.out.print(state[i]);
			}
			System.out.println(result);
//			System.out.println();
			if(result<min) min=result;
			System.out.println("min="+min);
			return;
		}
		for(int i=0;i<arr.length&&index<arr.length;i++) {
			System.out.println(start+", "+index );
			System.out.println("여기가, "+ i+", "+arr[index][i]);
			if(arr[index][i]!=0 && !state[i]) {
//				state[i]=true;
//				bf(arr, state, i, index+1, result+arr[index][i]);
//				state[i]=false;
//			} else if(arr[index][i]!=0 && !state[i]) {
//			} else if(arr[index][i]!=0 && !state[i] && (
//					index!=arr.length-1 && i!=start || index==arr.length-1 && i==start)) {
				state[i]=true;
				System.out.println(start+", "+index +" , "+ i+", "+arr[index][i]);
//				System.out.println(Arrays.toString(state));
				bf(arr, state, start, index+1, result+arr[index][i]);
				state[i]=false;
			}
		}
		System.out.println("???");
//		}catch(Exception e) {
//			System.err.println(e.toString());
//		}
	}
}
