import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	static void sort(int[] arr) {
		quickSort(arr, 0, arr.length);
	}
	static void quickSort(int[] arr, int start, int finish) {
		if(finish - start > 1) {
			Random r = new Random();
			int pivotIndex = r.nextInt(finish - start) + start;
			partition(arr, pivotIndex, start, finish);
		}
	}
	static void partition(int[] arr, int pivotIndex, int start, int finish) {
		int less = start;
		int more = start;
		for(int i = start; i < finish; i++){
			if(arr[i] >= arr[pivotIndex]) {
				more++;
			}
			else if(arr[i] < arr[pivotIndex]){
				//swap and increment both
				less++;
				more++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		for(int i = 0; i < testCount; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) arr[j] = in.nextInt();
			sort(arr);
			for (int j = 0; j < n; j++) {
			      if (j > 0) System.out.print(" ");
			      System.out.print(arr[j]);
			}
			System.out.println();	
		}
	}
}
