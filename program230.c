#include<stdio.h>


void CountAll(char str[])
{
    int iCountsmall=0;
    int iCountcapital=0;
    while(*str!='\0')
    {
        if (*str>='A' && *str<='Z')     //code done by me next will be same butlittle different
        {
           iCountcapital++;
        }

        if(*str>='a' && *str<='z')
        {
            iCountsmall++;
        }
        str++;


    }

    printf("Number of Capital Character are: %d\n",iCountcapital);
    printf("Number of Small Character are: %d\n",iCountsmall);
    
}
int main()
{
    char Arr[50]={'\0'};

    printf("Enter Your String : \n");
    scanf("%[^'\n']s",Arr);

    CountAll(Arr);

    return 0;
}