#include<stdio.h>
#include <stdbool.h>

bool CheckPrime(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    
    {
        iNo = -iNo;
    }

    for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            break;                          //optimination
        }
        
    }

    if(iCnt>iNo/2)                 //my logic (iCnt!=2||iCnt!=3)        //No factors
    {
        return true;
    }
    else                                    //atleat one factor
    {
        return false;
    }
    
}

int main()
{
    int iValue = 0;
    bool bRet=false;

    printf("Enter number : \n");
    scanf("%d",&iValue);

   bRet=CheckPrime(iValue);

   if(bRet==true)
    {
        printf("%d is Prime Number\n",iValue);
    }
    else
    {
         printf("%d is not Prime Number\n",iValue);
    }
    return 0;
}

/*
    time complexity: for prime -N/2
    time complexity : for non prime either 1 or 2
*/