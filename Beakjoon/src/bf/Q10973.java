package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10973 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		boolean[] state=new boolean[num];
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=num-1;i>0;i--) {
			state[arr[i]-1]=true;
			if(arr[i-1]>arr[i]) {
				int temp=arr[i-1];
				state[arr[i-1]-1]=true;
				for(int j=i-1;j<num;j++) {
					if(j==i-1) {
						for(int k=temp-2;k>=0;k--) {
							if(state[k]) {
								arr[j]=k+1;
								state[k]=false;
								break;
							}
						}
					} else {
						for(int k=num-1;k>=0;k--) {
							if(state[k]) {
								arr[j]=k+1;
								state[k]=false;
								break;
							}
						}
					}
				}
				for(int j:arr) {
					sb.append(j+" ");
				}
				System.out.println(sb);
				return;
			}
		}
		System.out.println(-1);
	}
}
