#include<stdio.h>
#include<stdlib.h>


float Average(int Arr[],int iSize)
{
    int iCnt=0,iSum=0;;
    
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        iSum=Arr[iCnt]+iSum;
    }

    return (float)iSum/(float)iSize; 
    
}
int main()
{
    int iLength=0,iCnt=0;
    float fRet=0.0f;
    int *ptr=NULL;

    printf("Enter No. of Elemensts:");
    scanf("%d",&iLength);               //5

    ptr=(int *) malloc (iLength * sizeof(int));
    if(NULL == ptr) 
    {
        printf("Unable to locate memmory");
        return -1;
    }

    printf("Enter the Elemnets :\n");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&ptr[iCnt]);

    }

    fRet=Average(ptr,iLength);
    printf("Avearge of Elements is: %f",fRet);

    free(ptr);

    return 0;
}