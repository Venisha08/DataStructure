#include <stdio.h>
void main()
{
    int arr[5]={18,30,15,70,12};
    int item = 50, i,pos=3;
    printf("Given array elements are :\n");
    for(i =0; i<5;i++)
    {
        printf("arr[%d]=%d",i,arr[i]);
    }
    arr[pos-1]=item;
    printf("\n Array elements after updation:\n");
    for(i=0;i<5;i++)
    {
    printf("arr[%d]=%d,",i,arr[i]);
}
}