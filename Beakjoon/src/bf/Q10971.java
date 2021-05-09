package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10971 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int min=0;
		int index=0;
		Stack<Integer> st=new Stack<Integer>();
		int[][] arr=new int[num][num];
		boolean[] state=new boolean[num];
		for(int i=0;i<num;i++) {
			StringTokenizer s=new StringTokenizer(br.readLine());
			for(int j=0;j<num;j++) {
				arr[i][j]=Integer.parseInt(s.nextToken());
			}
		}
		while(index<num) {
			if(st.size()==num) {
				min+=arr[st.peek()][st.get(0)];
				index++;
			}
			if(state[index] || st.size()!=0 && index==st.peek()) {
				index=(index+1)%num;
			} else if(st.size()==0) {
				st.add(index);
				state[index]=true;
				index=(index+1)%num;
			} else {
				min+=arr[st.peek()][index];
				st.add(index);
				state[index]=true;
				index=(index+1)%num;
			}
			System.out.println(index+"요기"+st.size());
		}
		System.out.println(st);
		System.out.println(min);
//		while(first<num) {
//			int sum=0;
//			int mid=first+1;
//			st.push(first);
//			state[first]=true;
//			while(true) {
//				if(!state[mid] && arr[st.peek()][mid]!=0) {
//					state[mid]=true;
//				} 
//				mid++;
//				if(count==10) break;
//			}
//			st.pop();
//			first++;
//		}
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
