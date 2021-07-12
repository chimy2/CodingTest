package brute_force_search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FindPrimeNumber {
    public int solution(String numbers) {
        int answer=0;
        String[] num=numbers.split("");
        boolean[] arr=new boolean[(int) Math.pow(10, numbers.length())];
        HashSet<String> hs=new HashSet<>();
        HashSet<Integer> result=new HashSet<Integer>();

        Arrays.sort(num);
        hs.add(arrToString(num));
        while(permutation(num, hs));

        Iterator<String> it=hs.iterator();
        while(it.hasNext()) {
            String s=it.next();
            for(int i=1;i<=s.length();i++) {
                result.add(Integer.parseInt(s.substring(0, i)));
            }
        }

        Arrays.fill(arr, true);
        for(int i=0;i<arr.length;i++) {
            if(i<2) arr[i]=false;
            else if(arr[i]) {
                for(int j=(int) Math.pow(i, 2);j<arr.length;j+=i) {
                    arr[j]=false;
                }
            }
        }

        Iterator<Integer> it2=result.iterator();
        while(it2.hasNext()) {
            if(arr[it2.next()]) answer++;
        }
        return answer;
    }

    public static boolean permutation(String[] arr, HashSet<String> hs) {
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i].compareTo(arr[i+1])>=0) continue;
            for(int j=arr.length-1;j>i;j--) {
                if(arr[i].compareTo(arr[j])<0) {
                    swap(arr, i, j);
                    break;
                }
            }
            int count=arr.length-(arr.length-i-2)/2-1;
            for(int j=i+1;j<count;j++) {
                swap(arr, j, arr.length+i-j);
            }
            hs.add(arrToString(arr));
            return true;
        }
        return false;
    }

    public static void swap(String[] arr, int i, int j) {
        String s=arr[i];
        arr[i]=arr[j];
        arr[j]=s;
    }

    public static String arrToString(String[] arr) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
