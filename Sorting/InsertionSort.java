package Sorting;
public class InsertionSort {
    // Main method
     public static void main (String args[])
     {
        int a[] = { 11,9,7,15,10,5,17};
        System.out.println("Array before insertion sort:");
        printArray(a);

        insertionSort(a);
         System.out.println("Array after insertion short:");
         printArray(a);
     }
      /*Function to sort array using insertion sort*/
     static void insertionSort(int arr[])
     {
        int len = arr.length;//calculating the length of the array
        for (int i = 1; i<len; i++)
       
        {
            int key = arr[i];
            int j = i-1;

            while(j >=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j + 1] = key;
        }
     }
     /* A utility function to print array of size n*/
     static void printArray(int a[])
     {
        int len = a.length;
        for(int i =0; i<len; ++i);
        System.out.println(a[i] + " ");
        System.out.println();
     }
} 
