package exercise;

//	시소 짝꿍
public class ChessPairs {

    public long solution(int[] weights) {
        long answer = 0;

        int max = 1000;
        int[] arr = new int[max + 1];

        for (int i : weights) {
            arr[i]++;
        }

        for (int i = 100; i <= max; i++) {
            if (arr[i] > 1) {
                answer += (long) arr[i] * (arr[i] - 1) / 2;
            }
            answer += getVal(arr, i, 4, 3);
            answer += getVal(arr, i, 4, 2);
            answer += getVal(arr, i, 3, 2);
        }
        return answer;
    }

    public long getVal(int[] arr, int i, int div, int mul) {
        double temp = 1.0 * i / div * mul;
        return temp % 1 == 0 ? (long) arr[i] * arr[(int) temp] : 0;
    }
}