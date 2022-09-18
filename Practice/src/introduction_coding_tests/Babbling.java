package introduction_coding_tests;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Babbling {
//	옹알이 (1)
	public int solution(String[] babbling) {
		String[] s = { "aya", "ye", "woo", "ma" };
		return IntStream.range(0, babbling.length).map(i -> {
			Arrays.stream(s).forEach(j -> babbling[i] = babbling[i].replace(j, "-"));
			return babbling[i].equals("-".repeat(babbling[i].length())) ? 1 : 0;
		}).sum();
//        int answer = 0;
//        for(int i=0; i<babbling.length; i++){
//            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
//                answer++;
//            }
//        }
//		return answer;
	}
}