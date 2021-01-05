package dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1003 {
//	피보나치 함수
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int[] input=new int[Integer.parseInt(br.readLine())];
		int[] zero=new int[41];
		int[] one=new int[41];
		for(int i=0;i<input.length;i++) {
			input[i]=Integer.parseInt(br.readLine());
		}
		zero[0]=1;
		for(int i=0;i<input.length;i++) {
			for(int j=1;j<=input[i];j++) {
				if(zero[input[i]]!=0 && one[input[i]]!=0) break;
				zero[j]=one[j-1];
				one[j]=zero[j-1]+zero[j];
			}
			bw.write(zero[input[i]]+" "+one[input[i]]);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
//	시간초과2
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int[] input=new int[sc.nextInt()];
//		int[] zero=new int[41];
//		int[] one=new int[41];
//		for(int i=0;i<input.length;i++) {
//			input[i]=sc.nextInt();
//		}
//		zero[0]=1;
//		for(int i=0;i<input.length;i++) {
//			for(int j=1;j<=input[i];j++) {
//				if(zero[input[i]]!=0 && one[input[i]]!=0) break;
//				zero[j]=one[j-1];
//				one[j]=zero[j-1]+zero[j];
//				System.out.println(j);
//			}
//			System.out.println(zero[input[i]]+" "+one[input[i]]);
//		}
//	}

//	시간초과1
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int[] input=new int[sc.nextInt()];
//		int[] num=new int[2];
//		for(int i=0;i<input.length;i++) {
//			input[i]=sc.nextInt();
//		}
//		for(int i=0;i<input.length;i++) {
//			num[0]=0;
//			num[1]=0;
//			fibonacci(input[i], num);
//			System.out.println(num[0]+" "+num[1]);
//		}
//	}
//	private static int fibonacci(int n, int[] num) {
//		if(n<=1) {
//			num[n]++;
//			return n;
//		} else {
//			return fibonacci(n-1, num)+fibonacci(n-2, num);
//		}
//	}
}
