package exercise;

public class CreateArrayByInvertingNaturalNumber {
    public int[] solution(long n) {
		String before=String.valueOf(n);
		int[] answer=new int[before.length()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=Character.getNumericValue(before.charAt(before.length()-i-1));
		}
        return answer;
    }
}
