package bf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6603 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		while(!(s=br.readLine()).equals("0")){
			StringTokenizer st=new StringTokenizer(s);
			int num=Integer.parseInt(st.nextToken());
			int[] arr=new int[num];
			boolean[] state=new boolean[num];
			for(int i=0;i<num;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			combination(arr, state, 0, 0, 6);
			System.out.println();
		}
	}
    public static void combination(int[] arr, boolean[] state, int idx, int n, int r) {
        if (n == r) {
            for (int i = 0; i < arr.length; i++) {
                if (state[i]) {
                    System.out.printf("%d ", arr[i]);
                }
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (state[i]) continue;
            state[i] = true;
            combination(arr, state, i, n + 1, r);
            state[i] = false;
        }
    }
}
