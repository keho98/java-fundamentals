import java.util.Scanner;

public class MergeSort {
	static void sort(int[] arr) {
		int len = arr.length;
		mergeSort(arr, 0, len);
	}
	//Copy arr0 to arr1
	static void copy(int[] arr0, int[]arr1, int start, int finish) {
		for(int i = start; i < finish; i++) arr1[i] = arr0[i];
	}
	static void merge(int[] arr, int start, int mid, int finish) {
		int[] mergedArr = new int[arr.length];
		int i0 = start;
		int i1 = mid;
		for(int i = start; i < finish; i++) {
			if (i0 == mid) {
				mergedArr[i] = arr[i1];
				i1++;
			}
			else if (i1 == finish) {
				mergedArr[i] = arr[i0];
				i0++;
			}
			else if(arr[i0] < arr[i1]) {
				mergedArr[i] = arr[i0];
				i0++;
			}
			else {
				mergedArr[i] = arr[i1];
				i1++;
			}
		}
		copy(mergedArr, arr, start, finish);	
	}
	static void mergeSort(int[] arr, int start, int finish) {
		if(finish - start > 1) {
			//String truncation automatically floors division
			int mid = (start + finish)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid, finish);
			merge(arr, start,mid,finish);
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
