/****************************************************************************
* InsertionSort.java 
*
* Name:Jared Rolon
* Date:4/19/22
*
*Performs an Insertion Sort with the numbers gievn in Alg Test
*
*
****************************************************************************/

public class InsertionSort {

  // the sort() method sorts the entire array in place
  public static long[] sort(int[] nums) {
    long[] counts = {0,0} ;   // [stepCount, swapCount] initially both 0

    for (int i = 1; i < nums.length; i++) {   
         int key = nums[i];
         int j = i-1;
         
         while (j >= 0 &&  nums[j] > key)  {
          nums[j+1] = nums[j];
          j = j-1;
          counts[0]++;
         }
      nums [j+1] = key;
      counts[1]++;
    }
    return counts;                 
  }

  // swap two elements of an array
  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}