import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	static void sort(int[] arr) {
		Arrays.sort(arr);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = in.nextInt();
		sort(arr);
		for (int i = 0; i < n; i++) {
		      if (i > 0) System.out.print(" ");
		      System.out.print(arr[i]);
		}
		System.out.println();
	}
}
