package kakao_blind_recruitment2018;

import java.util.Arrays;

public class NNumberGame {
	public static void main(String[] args) {  
//		int n=2, t=4, m=2, p=1;  
//		int n=16, t=16, m=2, p=1;  
		int n=3, t=10, m=10, p=1;  
		StringBuffer sb=new StringBuffer();  
		char[] arr=new char[t*m];  
		int[] arr2=new int[t*m];  
		int max=1;  
		for(int i=0;i<arr.length;i++) {   
			arr2[i]=i;  
		}  
		for(int i=1,j=0;i<t*m;j++) {  
			int num=j;  
			int count=i+max;  
			do {  
				if(count<=t*m) {         
					arr[count-1]=Character.toUpperCase(Character.forDigit(num%n, n));  
					//               
					System.out.println(i+"----------, index="+(i+count)+", "+num+", "+num%n);      
				}      
				count--;      
				num/=n;   
			} while(num>0 &&i<t*m);  
			//         i+=Math.ceil((float)(j+1)/n);   
			System.out.println("값="+((Math.pow(n, max)-Math.pow(n, max-1))*max+Math.pow(n, max-1)));   
//			if(Math.pow(n, max)*max<j+1) {    
			if(((Math.pow(n, max)-Math.pow(n, max-1))*max+Math.pow(n, max-1))<j+1) {  
				max++;   
			}   
			i+=max;      
//			System.out.println((int)Math.sqrt(j)+", "+Math.sqrt(j)+", "+j+", "+max);       
			System.out.println(Arrays.toString(arr));       
			System.out.println(Arrays.toString(arr2));       
			System.out.println();    
		}    
		System.out.println(Math.sqrt(9));    
		System.out.println(Arrays.toString(arr));    
		System.out.println(Arrays.toString(arr2));    
		for(int i=0;i<t;i++) {       
			sb.append(arr[i*m+p-1]);  
		}        
		System.out.println(sb);  
	}
}
