//Code to demostrate the need of iteration

#include<stdio.h>
int main()
{
    int iNo=0,iDigit=0;

    printf("Enter No.: \n");
    scanf("%d",&iNo);

    printf("\n............................................................\n");
    printf("Original Value of iNo is: %d\n",iNo);

    while ((iNo!=0))
    {
        printf("............................................................\n");
        iDigit=iNo%10;
        printf("iDigit is : %d\n",iDigit);
        iNo=iNo/10;
        printf("iNo is : %d\n",iNo);
    }

    printf("............................................................\n");
     
    return 0;
    
}