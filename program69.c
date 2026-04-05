//iteration

#include<stdio.h>

int CountDigit(int iNo)
{
    int iCount=0;

    while ((iNo!=0))
    {
        iNo=iNo/10;
        iCount++;
    }

    return iCount;
}
int main()
{
    int iValue=0;
    int iRet=0;

    printf("Enter No.: \n");
    scanf("%d",& iValue);

    iRet=CountDigit(iValue);

    printf("Total Number of digits :\n%d",iRet);

    return 0;

}