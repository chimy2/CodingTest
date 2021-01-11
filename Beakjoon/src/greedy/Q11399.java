package greedy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11399 {
//	ATM
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[Integer.parseInt(br.readLine())];
		String p=br.readLine();
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(p.split(" ")[i]);
		}
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
		for(int i=0;i<arr.length;i++) {
			answer+=arr[i];
		}
		System.out.println(answer);
	}
}
