package exercise;

public class SumBetweenTwoIntegers {
    public long solution(long a, long b) {
        return a==b?a:(Math.max(a, b)*(Math.max(a, b)+1)-(Math.min(a, b)-1)*(Math.min(a, b)))/2;
    }
}
