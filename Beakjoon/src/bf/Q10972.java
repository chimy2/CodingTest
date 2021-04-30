package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q10972 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		Integer[] arr=new Integer[num];
		Integer[] arr2=new Integer[num];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		if(Arrays.equals(arr, arr2)) {
			System.out.println(-1);
		} else {
			for(int i=num-1;i>0;i--) {
				if(arr[i-1]<arr[i]) {
					int temp=0;
					int index=i;
					for(int j=i+1;j<num;j++) {
						if(arr[i-1]<arr[j] && 
								(index==i || arr[index]>arr[j])) {
							index=j;
						}
					}
					temp=arr[i-1];
					arr[i-1]=arr[index];
					arr[index]=temp;
					for(int j=0;j<(num-i)/2;j++) {
						temp=arr[i+j];
						arr[i+j]=arr[num-j-1];
						arr[num-j-1]=temp;
					}
					break;
				}
			}
			for(int i:arr) {
				System.out.printf("%d ", i);
			}
		}
	}
}
