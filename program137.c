#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef int * IPTR; 

//O(N)
bool LinearSearch(int Arr[],int iSize,int iNo)
{
    int iCount=0,iCnt=0;
    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt]==iNo)
        {
            iCount++;
        }
    }
    
        if(iCount>0)
        {
            return true;
        }
        else
        {
            return false;     
        }

}

int main()
{
    int iLength=0,iCnt=0,iValue=0;
    IPTR iPtr=NULL; 
    bool bRet=false;

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

    printf("Enter the Number to Search :");
    scanf("%d",&iValue);

    //Step-2:Use the Memory
    bRet=LinearSearch(iPtr,iLength,iValue);

    if(bRet==true)
    {
        printf("%d is present in the data...",iValue);
    }
    else
    {
         printf("%d is not spresent in the data...",iValue);
    }

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}