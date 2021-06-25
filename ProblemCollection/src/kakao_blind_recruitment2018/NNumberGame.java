package kakao_blind_recruitment2018;

import java.util.Arrays;

public class NNumberGame {
   public static void main(String[] args) {
//      int n=2, t=4, m=2, p=1;
//      int n=16, t=16, m=2, p=1;
      int n=3, t=10, m=10, p=1;
//      n-진법, t-구할갯수, m-게임참가인원, p-순서
//      칸 수
      StringBuffer sb=new StringBuffer();
      char[] arr=new char[t*m];
      int[] arr2=new int[t*m];
      int max=1;
      for(int i=0;i<arr.length;i++) {
    	  arr2[i]=i;
      }
      for(int i=1,j=0;i<t*m;j++) {
         int num=j;
         int count=j/n;
         System.out.println(num+"======");
         do {
            if(i+count<=t*m) {
               arr[i+count-1]=Character.toUpperCase(Character.forDigit(num%n, n));
//               System.out.println(i+", index="+(i+count)+", "+num+", "+num%n);
            }
            System.out.println(count);
            count--;
            num/=n;
         } while(num>0 &&i<t*m);
//         i+=Math.ceil((float)(j+1)/n);
         System.out.println(Math.pow(n, max)*max);
         if(Math.pow(n, max)*max<j+1) {
        	 max++;
         }
         i+=max;
         
         System.out.println((int)Math.sqrt(j)+", "+Math.sqrt(j)+", "+j+", "+max);
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
//      System.out.println(li);
      System.out.println(sb);
   }
}