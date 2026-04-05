#include<stdio.h>

int CountNonFactors(int iNo)
{
    int iCnt = 0;
    int iFrequency=0;

    if(iNo < 0)
    
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) !=0)
        {
            iFrequency++;
        }   
    }
    
    return iFrequency;

}

 // Time Complexity : O(N)

int main()
{
    int iValue = 0,iRet=0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

   iRet=CountNonFactors(iValue);

   printf("Total Number of Non factors are:%d\n",iRet);

    return 0;
}