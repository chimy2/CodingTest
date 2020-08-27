package blind_recruitment;

import java.util.Scanner;

public class StringCompression {
	public int solution(String s) {
		int answer=0;
		int max=(int)s.length()/2;
		int[] arr=new int[max];
		//묶는 크기별로 문자열크기를 계산해놓을 배열 만들기
		for(int i=1;i<=max;i++) {//문자열 크기별로 계산하기
			for(int j=0;j<s.length();j++) {//문자열 크기에 맞게 나눠 압축하기
				if(s.substring(i*j,i).equals(s.substring(i+1,i))) {
				//현재 인덱스와 다음 인덱스 비교
				}
				/*abcabcdede
				 * 0-1 1-2 2-3 3-4 4-5 5-6 6-7 7-8 8-9 9번 length(10)/1-1=9
				 * 01-23 23-45 45-67 67-89 4번 length/2-1=4
				 * 012-345 345-678 2번 length/3-1=2
				 * 0123-4567 1번 length/4-1=2
				 * 01234-56789 1번 length/5-1=2
				 * */
				
				for(int k=0;k< ((((int)s.length()/(j+1)-1)>1)?s.length()/j-1:1);) {
					
				}
			}
		}
		//배열값을 비교하여 제일 작은 값을 answer에 담기
		return answer;
	}
}