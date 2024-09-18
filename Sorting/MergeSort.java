package Sorting;

public class MergeSort {
     // this function display the array
     public static void main(int[]arr, int size) 
     {
        for(int i =0; i< size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
     }

     // main function of the program
     public static void main(String[] args)
      {
        int[]a = {12,8,4,14,36,64,15,72,67,84};
        int size = a.length;
        display(a,size);
        MergeSort(a, 0 , size-1);
        display(a,size); 
     }
     // this function apply merging and sorting in the array
     public static void main(int []arr,int left,int mind,int right)
      {
        int i , j, k;
        int n1 = mid - left +1;
        int n2 = right - mid;
         // create temp arrays to store left and right sub-arrays
          
         int L[] = new int[n1];
         int R[] = new int [n2];

         // Copying data to temp arrays L[] and R[]
         



        
     }

}
