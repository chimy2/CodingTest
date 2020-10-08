package exercise;

public class IntegerSquareRootDiscriminant {
    public long solution(long n) {
        double n2=Math.sqrt(n);
        return n2-(long)n2>0?-1:(long)Math.pow(n2+1,2);
    }
}
