#include<stdio.h>
int strlenX(char str[])
{
    int iCount=0;

    while(*str!='\0')
    {
        printf("%c\n",*str);
        str++;
        iCount++;
    }

    return iCount;
    
}
int main()
{
    char Arr[50]={'\0'};
    int iRet=0;

    printf("Enter Your String : \n");
    scanf("%[^'\n']s",Arr);

    iRet=strlenX(Arr);

    printf("String Lenght is : %d",iRet);

    return 0;
}