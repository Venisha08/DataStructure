#include <stdio.h>  
  
void main() {  
   int arr[] = {18, 30, 15, 70, 12};  
   int k = 30, n = 5;  
   int i, j;  
     
   printf("Given array elements are :\n");  
      
   for(i = 0; i<n; i++) {  
      printf("arr[%d] = %d,  ", i, arr[i]);  
   }  
      
   j = k;  
      
   while( j < n) {  
      arr[j-1] = arr[j];  
      j = j + 1;  
   }  
      
   n = n -1;  
     
   printf("\nElements of array after deletion:\n");  
      
   for(i = 0; i<n; i++) {  
      printf("arr[%d] = %d,  ", i, arr[i]);  
   }  
}