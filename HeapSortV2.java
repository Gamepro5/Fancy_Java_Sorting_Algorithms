import java.util.Arrays;
public class HeapSortV2 {
	public static void main(String[] args) {
		int[] z = new int[6];
		z[0] = 9;
		z[1] = 2;
		z[2] = 34;
		z[3] = 5;
		z[4] = 1;
		z[5] = 44;
		int[] nums = { 3, 9, 7, 1, 8, 2, 10, 4, 6, 5};
		heapSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void heapSort(int[] array) {
		buildMaxHeap(array);
		sortHeap(array);
	}
	/* Builds a max heap out of all array elements passed in. */
	private static void buildMaxHeap(int[] array) {
		// Hint: call heapify for every element in the array
		// But in terms of efficiency, do we really need to
		//heapify the leaves of the tree?
		for (int i=array.length-1;i>=0;i--) {
			heapify(array, i, array.length);
			//System.out.println(Arrays.toString(array));
		}
		//System.out.println(Arrays.toString(array));
	}
	/* Sorts heap until we have just one element left in the array. */
	private static void sortHeap(int[] array) {
		int last = array.length-1;
		while (last>0) {
			swap(array, 0, last);
			heapify(array, 0, last);
			last = last - 1;
			System.out.println(Arrays.toString(array));
		}
		
		
		
		
	}
	/* Analyzes node i and makes necessary swaps until maxIndex is
reached */
	private static void heapify(int[] heap, int i, int maxIndex)
	{
		int currentIndex, leftChild, rightChild;
		while(i < maxIndex) {
			currentIndex = i;
			leftChild = (2*i)+1;
			rightChild = (2*i)+2;
			
			if (leftChild < maxIndex && heap[leftChild] > heap[currentIndex]) {
				currentIndex = leftChild;
			}
			if (rightChild < maxIndex && heap[rightChild] > heap[currentIndex]) {
				currentIndex = rightChild;
			}
			if (currentIndex == i) {
				return;
			}
			
			swap(heap,i,currentIndex);
			i = currentIndex;
			
		}
	}
	// a helpful swap function
	public static void swap(int[] array, int firstItemIndex, int
			lastItemIndex) {
		int tmp = array[firstItemIndex];
		array[firstItemIndex] = array[lastItemIndex];
		array[lastItemIndex] = tmp;
	}
}