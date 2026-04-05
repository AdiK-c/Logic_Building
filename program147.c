#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR; 

int Minimun(int Arr[],int iSize)
{
    int iCnt=0;
    int iMin=0;

    for (iMin=Arr[0],iCnt=1;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]<iMin)
        {
            iMin=Arr[iCnt];
        }
    }

        return iMin;
}

int main()
{
    int iLength=0,iCnt=0,iRet=0;
    IPTR iPtr=NULL; 

    printf("Enter The Number of Elements :");
    scanf("%d",&iLength);


    //Step-1:Allocate the Memory 
    iPtr =(IPTR)malloc(iLength * sizeof(int));

    if(NULL==iPtr)
    {
        printf("Unable to allocate the Memory");
        return -1;
    }

    printf("Enter the Values:\n");

    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&iPtr[iCnt]);
    }

    //Step-2:Use the Memory
    iRet=Minimun(iPtr,iLength);

    printf("Minimum No. is: %d",iRet);

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}