package kakao_blind_recruitment2018;

import java.util.Stack;

public class NNumberGame {
    public String solution2(int n, int t, int m, int p) {
		StringBuffer sb=new StringBuffer();
		Stack<Character> st=new Stack<Character>();
		char[] arr=new char[t*m];
		for(int index=0, i=0;index<t*m;i++) {
			int num=i;
			do {
				st.add(Character.toUpperCase(Character.forDigit(num%n, n))); 
				num/=n;   
			} while(num>0);  
			while(!st.isEmpty() && index<t*m) {
				arr[index++]=st.pop();
			}
		}
		 
		for(int i=0;i<t;i++) {       
			sb.append(arr[i*m+p-1]);  
		}   
        return sb.toString();
    }
	
//	46.2 / 100.0
    public String solution(int n, int t, int m, int p) {
		StringBuffer sb=new StringBuffer();  
		char[] arr=new char[t*m];  
		int[] arr2=new int[t*m];  
		int max=1;  
		int maxCounter=n;
		for(int i=0;i<arr.length;i++) {   
			arr2[i]=i;  
		}  
		for(int i=0,j=0;i<t*m;j++) {  
			int num=j;  
			int count=i+max;  
			do {  
				if(count<=t*m) {         
					arr[count-1]=Character.toUpperCase(Character.forDigit(num%n, n));  
				}      
				count--;      
				num/=n;   
			} while(num>0 &&i<t*m);  
			i+=max;   
			if(maxCounter<=i) {  
				max++;
				maxCounter=(int) ((Math.pow(n, max)-Math.pow(n, max-1))*max+Math.pow(n, max-1));
			}      
		}    
		for(int i=0;i<t;i++) {       
			sb.append(arr[i*m+p-1]);  
		}        
        return sb.toString();
    }
}
