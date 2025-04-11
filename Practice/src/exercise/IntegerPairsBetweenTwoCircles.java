package exercise;

//	두 원 사이의 정수 쌍
public class IntegerPairsBetweenTwoCircles {

    public long solution(int r1, int r2) {
        return (long) ((r2 - r1 + 1) + getCoorCount(r2, false) - getCoorCount(r1, true)) * 4;
    }

    public long getCoorCount(int r, boolean check) {
        long result = 0;
        long num = (long) r * r;

        for (int i = 1; i < r; i++) {
            double temp = Math.sqrt(num - (long) i * i);
            result += Math.floor(check && temp % 1 == 0 ? temp - 1 : temp);
        }

        return result;
    }
}