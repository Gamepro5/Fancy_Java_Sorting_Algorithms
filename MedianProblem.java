import java.util.Arrays;

//Starter code for Median

public class MedianProblem {

	public static void main(String[] args) {
		int[] a = { 3, 8, 4, 1, 7, 2, 5, 6, 9 };
		int[] b = { 3, 8, 4, 1, 7, 2, 5, 6, 9, 10 };
		int[] c = { 3 };
		//  Test cases
		System.out.println((findMin(a,0,a.length))/2.0);
		//  This should print 5.0
		System.out.println("The median of array a is: " + median(a));
		//  This should print 5.5        
		System.out.println("The median of array b is: " + median(b));
		//  This should print 3.0        
		System.out.println("The median of array c is: " + median(c));
	}

	// quickSort is now renamed to median

	public static double median(int[] a) {

		return quick(a, 0, a.length - 1);

	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
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
		return splitPos;
	}

	// You modify the quick method
	public static int findMin(int[] arr, int left, int right) {
		int returnValue = arr[left];

		for (int j=left;j<right;j++) {
			if (arr[j] < returnValue) {
				returnValue = arr[j];
			}

		}
		return returnValue;
	}
	public static int findMax(int[] arr, int left, int right) {
		int returnValue = arr[left];

		for (int j=left;j<right;j++) {
			if (arr[j] > returnValue) {
				returnValue = arr[j];
			}

		}
		return returnValue;
	}

	public static double quick(int[] a, int left, int right) {
		if (right > left) {
			int pivotPos = partition(a, left, right);
	
			if (a.length%2 == 1) {
				//odd case
				if (pivotPos == a.length/2) {
					return a[a.length/2];
				}
			} else {
				//even case
				if (pivotPos == a.length/2) {
					return (a[a.length/2] + findMax(a,left,((a.length/2))))/2.0;
				} else if (pivotPos == a.length/2 - 1) {
					return (a[a.length/2-1] + findMin(a,((a.length/2)),right))/2.0;
				}
			}
			if (pivotPos < a.length/2) {
				return quick(a, pivotPos+1, right);
				
			} else {
				return quick(a,left,pivotPos-1);
			}
		} else {
			return a[left];
		}
		
	}

}


