package blind_recruitment;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abcabcdede";
        int answer = 0;
        int num=1;
        String check="";
		//한문자열을 받고 그 문자열을 1개 이상의 단위마다 잘라 압축한 문자열의 길이를 측정
        if(s.substring(0).equals(1)) {
        	num++;
        }else if(!s.substring(0).equals(1)) {
        	check+=s.substring(0);
        }/*
        abcde
        a-b b-c c-d d-e
        ab-bd +e
        s/2
        */
		//그 단계별로 나눈 문자열의 길이를 기록한 배열에서 가장 작은 값을 골라 answer변수에 넣는다
        System.out.println(answer);
	}

}
