#include<stdio.h>
int main()
{
    int iNo=7236,iDigit=0;

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n",iNo);

    iDigit=iNo%10;
   printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    return 0;
}