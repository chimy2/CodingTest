package blind_recruitment;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abcabcdede";
        int answer = 0;
        int num=1;
        String check="";
		//�ѹ��ڿ��� �ް� �� ���ڿ��� 1�� �̻��� �������� �߶� ������ ���ڿ��� ���̸� ����
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
		//�� �ܰ躰�� ���� ���ڿ��� ���̸� ����� �迭���� ���� ���� ���� ��� answer������ �ִ´�
        System.out.println(answer);
	}

}
