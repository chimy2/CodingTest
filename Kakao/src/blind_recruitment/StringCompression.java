package blind_recruitment;

import java.util.Scanner;

public class StringCompression {
	public int solution(String s) {
		int answer=0;
		int max=(int)s.length()/2;
		int[] arr=new int[max];
		//���� ũ�⺰�� ���ڿ�ũ�⸦ ����س��� �迭 �����
		for(int i=1;i<=max;i++) {//���ڿ� ũ�⺰�� ����ϱ�
			for(int j=0;j<s.length();j++) {//���ڿ� ũ�⿡ �°� ���� �����ϱ�
				if(s.substring(i*j,i).equals(s.substring(i+1,i))) {
				//���� �ε����� ���� �ε��� ��
				}
				/*abcabcdede
				 * 0-1 1-2 2-3 3-4 4-5 5-6 6-7 7-8 8-9 9�� length(10)/1-1=9
				 * 01-23 23-45 45-67 67-89 4�� length/2-1=4
				 * 012-345 345-678 2�� length/3-1=2
				 * 0123-4567 1�� length/4-1=2
				 * 01234-56789 1�� length/5-1=2
				 * */
				
				for(int k=0;k< ((((int)s.length()/(j+1)-1)>1)?s.length()/j-1:1);) {
					
				}
			}
		}
		//�迭���� ���Ͽ� ���� ���� ���� answer�� ���
		return answer;
	}
}