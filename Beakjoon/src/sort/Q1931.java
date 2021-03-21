package sort;
import java.io.BufferedReader;

public class Q1931 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[][] arr=new int[num][2];
		int start=0;
		int end=0;
		int answer=0;
		for(int i=0;i<num;i++) {
			String s=br.readLine();
			int index=Integer.parseInt(s.split(" ")[0]);
			int element=Integer.parseInt(s.split(" ")[1]);
			arr[i]=new int[]{index, element};
		}
		quickSort(arr);
		for(int i=0;i<num;i++) {
			if(end<=arr[i][0]) {
				start=arr[i][0];
				end=arr[i][1];
				answer++;
			}else if(end>arr[i][1]) {
				start=arr[i][0];
				end=arr[i][1];
			}
		}
		System.out.println(answer);
	}

    public static void quickSort(int[][] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[][] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[][] arr, int low, int high) {
        int pivot = arr[(low + high) / 2][0];
        int pivotValue = arr[(low + high) / 2][1];
        while (low <= high) {
            while (arr[low][0] <= pivot) {
            	if(arr[low][0] == pivot && arr[low][1] >= pivotValue) break;
            	low++;
            }
            while (arr[high][0] >= pivot) {
            	if(arr[high][0] == pivot && arr[high][1] <= pivotValue) break;
            	high--;
            }
            if (low <= high) {
            	if(low < high) {
            		swap(arr, low, high);
            	}
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
