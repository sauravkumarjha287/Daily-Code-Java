package org.tnsif.codingchallenge;
/* Given an array no.'s of n integer where n is greater than 1 return an array 
 * output such that output of ith index is equal to the product of all the 
 * elements of no.'s except no.'s of ith index.
 *input: [1,2,3,4]
 *output: [24,12,8,6]*/

public class ProdExceptithElement{
	/* Function to print product array
    for a given array arr[] of size n */
    void productArray(int arr[], int n)
    {
  
        // Base case
        if (n == 1) {
            System.out.print(0);
            return;
        }
        // Initialize memory to all arrays
        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];
  
        int i, j;
  
        /* Left most element of left array
is always 1 */
        left[0] = 1;
  
        /* Right most element of right
array is always 1 */
        right[n - 1] = 1;
  
        /* Construct the left array */
        for (i = 1; i < n; i++)
            left[i] = arr[i - 1] * left[i - 1];
  
        /* Construct the right array */
        for (j = n - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];
  
        /* Construct the product array using
        left[] and right[] */
        for (i = 0; i < n; i++)
            prod[i] = left[i] * right[i];
  
        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
  
        return;
    }
  
    /* Driver program to test the above function */
    public static void main(String[] args)
    {
        ProdExceptithElement pa = new ProdExceptithElement();
        int arr[] = {1,2,3,4 };
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }
}
