import java.util.Random;

public class QuickSort extends Sort {
	static void swap(int[] arr, int i0, int i1) {
		int tmp = arr[i0];
		arr[i0] = arr[i1];
		arr[i1] = tmp;
	}
	static void sort(int[] arr) {
		quickSort(arr, 0, arr.length);
	}
	static int getPivot(int start, int finish) {
		Random r = new Random();
		return r.nextInt(finish - start) + start;
	}
	static void quickSort(int[] arr, int start, int finish) {
		if(start < finish) {
			int pivotIndex = getPivot(start,finish);
			int newPivotIndex = partition(arr, pivotIndex, start, finish);
			quickSort(arr, start, newPivotIndex - 1);
			quickSort(arr, newPivotIndex + 1, finish);
		}
	}
	static int partition(int[] arr, int pivotIndex, int start, int finish) {
		swap(arr, pivotIndex, start);
		int more;
		int less = more = start + 1;
		for(int i = start + 1; i < finish; i++){
			if(arr[i] >= arr[start]) {
				more++;
			}
			else if(arr[i] < arr[start]){
				//swap and increment both
				swap(arr, more, less);
				less++;
				more++;
			}
		}
		int newPivotIndex = less - 1;
		swap(arr, start, newPivotIndex);
		return newPivotIndex;
	}
}
