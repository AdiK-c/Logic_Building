#include<stdio.h>


int CountOccurance(char str[],char ch)
{
    int iCount=0;
    while(*str!='\0')
    {
        if (*str==ch)
        {
           iCount++;
        }
        str++;
    }

    return iCount;
    
}
int main()
{
    char Arr[50]={'\0'};
    int iRet=0;
    char cValue='\0';

    printf("Enter Your String : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the character : \n");
    scanf(" %c",&cValue);               //initail spcace is given and it will work on all OS

    iRet=CountOccurance(Arr,cValue);

    printf("Number of %c in the String is : %d",cValue,iRet);

    return 0;
}