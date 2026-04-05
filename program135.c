#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR; 

int FrequencyCalculate(int Arr[],int iSize )
{
    int iCount=0,iCnt=0;
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt]==11)
        {
            iCount++;
        }
    }

    return iCount;
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

    iRet=FrequencyCalculate(iPtr,iLength);

    printf("Frequency of 11 is: %d\n",iRet);

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}