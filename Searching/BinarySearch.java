package Searching;

public class BinarySearch {
    public static void main(String[]args)
    {
        int []arr = {3,2,1,7,5,6,4};
        // Sorting the Given Array
        Arrays.sort(arr);
        System.out.println("The given array is :");
        // Printing the array using loops
        for (int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        int len = Arrays.binarySearch(arr,3);
        System.out.println("Element is found at "+(len +1)+ "position");

    }
}
