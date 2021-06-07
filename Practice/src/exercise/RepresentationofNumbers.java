package exercise;

public class RepresentationofNumbers {
	public static void main(String[] args) {
		int n=15;
		int answer=0;
		for(int i=1;i<=n;i++) {
			int sum=i;
			for(int j=i+1;sum<n;j++) {
				sum+=j;
			}
			if(sum==n) answer++;
		}
		System.out.println(answer);
	}
}
