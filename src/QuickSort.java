import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	static void sort(int[] arr) {
		Random r = new Random();
		int pivotIndex = r.nextInt(arr.length);
		partition(arr, pivotIndex);
	}
	static void partition(int[] arr, int pivotIndex) {
		
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
