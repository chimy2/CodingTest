package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10974 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int count=1;
		StringBuffer sb=new StringBuffer();
		int[] arr=new int[num];
		boolean[] state=new boolean[num];
		
		for(int j=1;j<=num;j++) {
			arr[j-1]=j;
			count*=j;
			sb.append(j+" ");
		}
		sb.append("\n");
		
		for(int i=1;i<=count;i++) {
			for(int j=num-1;j>0;j--) {
				state[arr[j]-1]=true;
				if(arr[j-1]<arr[j]) {
					int temp=arr[j-1];
					state[arr[j-1]-1]=true;
					for(int k=j-1;k<num;k++) {
						if(k==j-1) {
							for(int l=temp;l<num;l++) {
								if(state[l]) {
									arr[k]=l+1;
									state[l]=false;
									break;
								}
							}
						} else {
							for(int l=0;l<num;l++) {
								if(state[l]) {
									arr[k]=l+1;
									state[l]=false;
									break;
								}
							}
						}
					}
					for(int k:arr) {
						sb.append(k+" ");
					}
					sb.append("\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
