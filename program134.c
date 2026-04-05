#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR; 

int main()
{
    int iLength=0,iCnt=0;
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

    //Call to the Function which coantains the Business Logic
    //Fun(iPtr,iLenght);

    //Step-3: Free the Memory
    free(iPtr);

    return 0;
}