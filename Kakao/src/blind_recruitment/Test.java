package blind_recruitment;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int answer = 0;
		String s="xababcdcdababcdcd";
		String check="",before="",after="";
		int num=1,su=0;
		int len=s.length();
		int max=(int)len/2;
		int[] arr=new int[max];
		for(int i=1;i<=max;i++) {
			num=1;
			check="";
			su=(len%i>0&&(int)len/i>2) ? (int)len/i : len/i-1;
			for(int j=1;j<=su;j++) {
				before=s.substring(i*(j-1),i*(j-1)+i);
				after=s.substring(i*j,i*j+i);
				if(before.equals(after)) {
					//값이 같으면 num을 올린다
					num++;
					System.out.println(i+" 같음 "+before+", "+after+", num :"+num+", check :"+check);
				}else if(!before.equals(after)&&num>1) {
					//값이 다른데 num이 1초과라면 check에 num+before를 붙여넣는다
					check+=num+before;
					System.out.println(i+"다르지만 중복됐음 "+before+", "+after+", num :"+num+", check :"+check);
					num=1;
				}else if(!before.equals(after)){
					check+=before;
					System.out.println(i+"다름 "+before+", "+after+", num :"+num+", check :"+check);
					//값이 다르다면 check에 before를 붙인다
				}if(j==su) {
					check+=after;
				}if(len%i>0) {
					check+=s.substring((int)len/i*i,len);//8/3*3 2
				}
			}System.out.println(i+"ckeck : "+check);
			arr[i-1]=check.length();
		}
		System.out.println(Arrays.toString(arr));
		answer=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(answer>arr[i]) answer=arr[i];
		}System.out.println(answer);
	}
}
