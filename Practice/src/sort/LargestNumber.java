package sort;

import java.util.Arrays;

public class LargestNumber {
    public String solution(int[] answers) {
    	StringBuffer sb=new StringBuffer();
    	Integer[] arr=Arrays.stream(answers).boxed().toArray(Integer[]::new);
    	sort(answers, 0, 1);
//    	Arrays.sort(arr, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1==0) return 1;
//				if(o2==0) return -1;
//				int num1=(int) Math.pow(10, (int) Math.log10(o2.doubleValue())+1)*o1+o2;
//				int num2=(int) Math.pow(10, (int) Math.log10(o1.doubleValue())+1)*o2+o1;
//				if(num1<num2) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		});
    	for(int i=0;i<arr.length;i++) {
    		sb.append(answers[i]);
    	}
//    	System.out.println(Arrays.toString(arr));
//    	System.out.println();
        return sb.toString();
    }
    
    public void sort(int[] answers, int i, int j) {
//    	System.out.println(i+", "+j);
    	
		int num1=(int) Math.pow(10, (int) Math.log10(answers[j])+1)*answers[i]+answers[j];
		int num2=(int) Math.pow(10, (int) Math.log10(answers[i])+1)*answers[j]+answers[i];
		System.out.println(i+", "+j+", "+num1+", "+num2);
		if(num1<num2) {
			int temp=answers[i];
			answers[i]=answers[j];
			answers[j]=temp;
		} 
		System.out.println(Arrays.toString(answers));
    	if(j<answers.length-1) {
    		sort(answers, i, j+1);
    	} else if(j==answers.length-1 && i<answers.length-2) {
    		sort(answers, i+1, i+2);
    	}
    }
	public static void main(String[] args) {
		LargestNumber l=new LargestNumber();
//		System.out.println(l.solution(new int[]{6,10,2})+", "+"6210");
//		System.out.println(l.solution(new int[]{3,30,34,5,9})+", "+"9534330");
//		System.out.println(l.solution(new int[]{40,400})+", "+"40400");
//		System.out.println(l.solution(new int[]{40,404})+", "+"40440");
//		System.out.println(l.solution(new int[]{12,121})+", "+"12121");
//		System.out.println(l.solution(new int[]{3054,305})+", "+"3054305");
//		System.out.println(l.solution(new int[]{3044,304})+", "+"3044304");
//		System.out.println(l.solution(new int[]{340,3403})+", "+"3403403");
//		System.out.println(l.solution(new int[]{340,3402})+", "+"3403402");
//		System.out.println(l.solution(new int[]{340,3405})+", "+"3405340");
//		System.out.println(l.solution(new int[]{40,405})+", "+"40540");
//		System.out.println(l.solution(new int[]{40,404})+", "+"40440");
//		System.out.println(l.solution(new int[]{40,403})+", "+"40403");
//		System.out.println(l.solution(new int[]{40,405})+", "+"40540");
//		System.out.println(l.solution(new int[]{40,404})+", "+"40440");
//		System.out.println(l.solution(new int[]{50,403})+", "+"50403");
//		System.out.println(l.solution(new int[]{50,405})+", "+"50405");
//		System.out.println(l.solution(new int[]{50,404})+", "+"50404");
//		System.out.println(l.solution(new int[]{30,403})+", "+"40330");
//		System.out.println(l.solution(new int[]{30,405})+", "+"40530");
//		System.out.println(l.solution(new int[]{30,404})+", "+"40430");
//		System.out.println(l.solution(new int[]{12,121})+", "+"12121");
//		System.out.println(l.solution(new int[]{2,22,223})+", "+"223222");
//		System.out.println(l.solution(new int[]{41,415})+", "+"41541");
//		System.out.println(l.solution(new int[]{2,22 })+", "+"222");
//		System.out.println(l.solution(new int[]{70,0,0,0})+", "+"70000");
		System.out.println(l.solution(new int[]{0,0,0,1000})+", "+"1000000");
//		System.out.println(l.solution(new int[]{0,0,0,0})+", "+"0");
//		System.out.println(l.solution(new int[]{0,0,70})+", "+"7000");
//		System.out.println(l.solution(new int[]{12,1213})+", "+"121312");
//		System.out.println(l.solution(new int[]{3,30,34,5,91})+", "+"91534330");
//		System.out.println(l.solution(new int[]{3,30,34,5,191})+", "+"534330191");
//		System.out.println(l.solution(new int[]{3,30,34,5,191,432789})+", "+"543278934330191");
//		System.out.println(l.solution(new int[]{1,2,3,4,5,44})+", "+"5444321");
//		System.out.println(l.solution(new int[]{1,2,3,4,5,66})+", "+"6654321");
//		System.out.println(l.solution(new int[]{3,30,31,5,9})+", "+"9533130");
//		System.out.println(l.solution(new int[]{3,30,31,34,5,9})+", "+"953433130");
//		System.out.println(l.solution(new int[]{3,30,31,34,33,5,9})+", "+"95343333130");
//		System.out.println(l.solution(new int[]{10,101})+", "+"10110");
//		System.out.println(l.solution(new int[]{1,11,111,1111})+", "+"1111111111");
//		System.out.println(l.solution(new int[]{0,0,0,0,0,0})+", "+"0");
//		
//		System.out.println(l.solution(new int[] {6, 10, 2}));
//		System.out.println("6210");
//		System.out.println(l.solution(new int[] {3, 30, 34, 5, 9}));
//		System.out.println("9534330");
//		System.out.println(l.solution(new int[] {90,908,89,898,10,101,1,8,9}));
//		System.out.println(l.solution(new int[] {40,403}));
//		System.out.println(l.solution(new int[] {383,38}));
//		System.out.println(l.solution(new int[] {838,83}));
//		System.out.println(l.solution(new int[] {12,121}));
//		System.out.println(l.solution(new int[] {21,212}));
//		System.out.println(l.solution(new int[] {0,0,0,1000}));
//		System.out.println(l.solution(new int[] {0,0,1000,0}));
//		System.out.println(l.solution(new int[] {0,1000,0,0}));
//		System.out.println(l.solution(new int[] {1000,0,0,0}));
//		System.out.println(l.solution(new int[] {0,0,80,0}));
//		System.out.println(l.solution(new int[] {1,2,0,1}));
//		System.out.println(l.solution(new int[] {0,0,0}));
//		System.out.println(l.solution(new int[] {1,2,3,4,5,6,7,8,9}));
//		System.out.println(l.solution(new int[] {998,9,999}));
		
	}
}
