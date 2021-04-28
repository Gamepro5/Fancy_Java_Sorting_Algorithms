import java.util.Arrays;

public class MergeSort
{
	
	public static void main(String[] args) {
		
		int[] w = {5,12,18,7,19,17};
		
		sort( w );
		System.out.println(Arrays.toString(w));
		
	}
	/**
 Sorts an array, using merge sort.
 @param a the array to sort
	 */
	
	
	
	
	public static void sort(int[] a)
	{
		if (a.length <= 1) {
			return; 
		} else {
			//create an array for the first half of a
			int[] first = new int[(int) Math.floor(a.length/2)];
			//create an array for the second half of a
			int[] second = new int[(int) Math.floor(a.length/2+(a.length%2))];
			
			// Now copy the first half of array a into first, the second half into second
			// your code here
			for (int i=0; i<((int) Math.floor(a.length/2)); i++) {
				first[i] = a[i];
			}
			int temp = 0;
			for (int i=((int) Math.floor(a.length/2)); i<a.length; i++) {
				second[temp] = a[i];
				temp=temp+1;
			}
			temp = 0;

			System.out.println(Arrays.toString(first) + Arrays.toString(second));
			
			sort(first);
			sort(second);
			
			
			merge(first, second, a);
		  // if length is less than or equal to one, the array is sorted
		
	
		// recursively sort the partitions of the array
		// your code here


		//Call merge to join the partitions together.
		//your code here
		}

			
		

	}

	/**

 Merges two sorted arrays into an array.  
 Note that this method is private (i.e. the user doesn’t need to know it exists)
 @param first the first sorted array
 @param second the second sorted array
 @param a the array into which to merge first and second
	 */
	private static void merge(int[] first, int[] second, int[] a)
	{

	//your code here

		

		


		



//		System.out.println(a.length);
			int iFirst = 0; // Next element to consider in the first array
			int iSecond = 0; // Next element to consider in the second array
			int j = 0; // Next open position in a

			// As long as neither iFirst nor iSecond past the end, move
			// the smaller element into a
			while (iFirst < first.length && iSecond < second.length)
			{
				if (first[iFirst] < second[iSecond])
				{
					a[j] = first[iFirst];
					iFirst++;
				}
				else
				{
					a[j] = second[iSecond];
					iSecond++;

				}
				j++;
			}

			// Note that only one of the two loops below copies entries
			// Copy any remaining entries of the first array
			while (iFirst < first.length)
			{
				a[j] = first[iFirst];
				iFirst++; j++;
			}
			// Copy any remaining entries of the second half
			while (iSecond < second.length)
			{
				a[j] = second[iSecond];
				iSecond++; j++;
			}
		



	}
	
}





