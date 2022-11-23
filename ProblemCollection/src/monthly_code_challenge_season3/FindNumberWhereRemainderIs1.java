package monthly_code_challenge_season3;

public class FindNumberWhereRemainderIs1 {
//	나머지가 1이 되는 수 찾기
	public int solution(int n) {
		for (int i = 2;; i++) {
			if (n % i == 1)
				return i;
		}
//        for(int i = 2; i < n/2; i++){
//            if(n%i == 1){
//                return i;
//            }
//        }
//        return n-1;
	}
}