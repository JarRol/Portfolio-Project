/****************************************************************************
* BubbleSort.java 
*
* Name:Jared Rolon
* Date:4/19/22
*
*Performs a Bubble Sort with the numbers gievn in Alg Test
*
*
****************************************************************************/

public class BubbleSort {

  // the sort() method sorts the entire array in place
  public static long[] sort(int[] nums) {
    long[] counts = {0,0} ;   // [stepCount, swapCount] initially both 0

    for (int k = 0; k < nums.length; k++) {   

      for (int j = 1; j < (nums.length - k); j++) {

        if (nums[j] < nums[j-1]) {
          swap(nums, j, j-1);
          counts[1]++;            
        }
        counts[0]++;               
      }
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