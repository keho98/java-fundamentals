public class InsertionSort extends Sort {
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
}
