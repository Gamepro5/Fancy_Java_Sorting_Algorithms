import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] k = { 3, 0, 4, 1, 7, 2, 5, 6 };
		int[] nums = { 3, 9, 7, 1, 8, 2, 10, 4, 5, 6 };
		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		quickSort(nums);
		//System.out.println(Arrays.toString(nums));
	}

	public static void quickSort(int[] a) {
		quick(a, 0, a.length - 1);
	}

	public static void quick(int[] a, int left, int right) { 
		if (right > left) {
			int pivotPos = partition(a, left, right);
			quick(a, left, pivotPos - 1);
			quick(a, pivotPos + 1, right);
		}
	}

	public static int partition(int[] a, int left, int right) {
		int splitPos = left;
		for (int i = left; i < right; i++) {
			if (a[i] < a[right]) {
				swap(a, i, splitPos);
				splitPos++;
			}
		}
		swap(a, splitPos, right);
		System.out.println(Arrays.toString(a));
		return splitPos;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}