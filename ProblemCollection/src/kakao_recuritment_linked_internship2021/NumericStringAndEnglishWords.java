package kakao_recuritment_linked_internship2021;

public class NumericStringAndEnglishWords {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for ( int i = 0; i < arr.length; i++ ) {
            s = s.replaceAll(arr[i], i+"");
        }
        return Integer.parseInt(s);
    }
}
