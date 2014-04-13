import java.util.Scanner;

public class InsertionSort {
	static void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			while(i > 0 &&  arr[i] < arr[i-1]) {
				int tmp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = tmp;
				i--;
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
