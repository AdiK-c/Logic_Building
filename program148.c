#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR; 

void Update(int Arr[],int iSize)
{
    int iCnt=0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        Arr[iCnt]++;
    }
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
   Update(iPtr,iLength);

    printf("Upadate array is: %d",iRet);

    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        printf{Arr[iCnt]};
    }

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}