package Sorting;

public class SelectionSort {
     public static void main(String args[])
     {
        int arr[] = {72,50,10,44,20};
        SelectionSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
     }
       static void SelectionSort (int a[])
       {
          int len = a.length;
          // One by one move boundary of unsorted sub-array
          for(int i =0 ; i< len -1;i++)
          {
            // Find the minimum element in unsorted array
            int min =i;
            for(int j = i+1; j<len ;j++)
              if(a[j] < a[min])
              min = j;

              // Swap the found minimum element with the
            // first element in unsorted part of the array
             int temp = a[min];
             a[min] = a[i];
             a[i] = temp ;
          }
       }
             //prints the sorted array
             static void printArray(int a[])
             {
                int len = a.length;
                for(int i =0; i<len ; ++i)
                System.out.println(a[i] + " ");
                System.out.println();
             }
}
 