#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR; 

int maximun(int Arr[],int iSize)
{
    int iCnt=0;
    int iMax=0;                 //Unable to handle negative values
    for (iCnt=0;iCnt<iSize;iCnt++)
    {
        if(Arr[iCnt]>iMax)
        {
            iMax=Arr[iCnt];
        }
    }

        return iMax;
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
    iRet=maximun(iPtr,iLength);

    printf("Maximun No. is: %d",iRet);

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}