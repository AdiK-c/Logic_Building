#include<stdio.h>
#include<stdlib.h>


int CountEven(int Arr[],int iSize)
{
    int iCnt=0,iCount=0;
    
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]%2==0)
        {
            iCount++;
        }
    }
    return iCount;
    
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

    iRet=CountEven(ptr,iLength);
    printf("Number of Even Element are: %d",iRet);

    free(ptr);

    return 0;
}