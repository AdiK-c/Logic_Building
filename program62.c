#include<stdio.h>
int main()
{
    int iNo=7236,iDigit=0;

    printf("............................................................\n");
    printf("Original Value of iNo is:\n",iNo);

    printf("............................................................\n");

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    printf("............................................................\n");

    iDigit=iNo%10;
   printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    printf("............................................................\n");

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    printf("............................................................\n");

    iDigit=iNo%10;
    printf("iDigit is :\n%d",iDigit);
    iNo=iNo/10;
    printf("iNo is :\n%d",iNo);

    return 0;
}