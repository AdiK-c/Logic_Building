#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
    int iCnt=0,iSum=0;
    
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        iSum=Arr[iCnt]+iSum;
    }
    return iSum;
    
}
int main()
{
    int iLength=0,iCnt=0,iRet=0;
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

    iRet=Summation(ptr,iLength);
    printf("Summation of Array Element is: %d",iRet);

    free(ptr);

    return 0;
}