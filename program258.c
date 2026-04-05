#include<stdio.h>
void strcatX(char *src,char *dest)
{
    while(*dest != '\0')
    {
        dest++;
    }

    while(*src!='\0')
    {
        *dest=*src;
        src++;
        dest++;
    }

    *dest='\0';     //*dest=*src is same 
}
int main()
{
    char Arr[50]={'\0'};
    char Brr[50]={'\0'};

    printf("Enter the Source String :\n");
    scanf("%[^'\n']s",Arr);

    printf("Enter the Destination String :\n");
    scanf(" %s",Brr);

    strcatX(Arr,Brr);
    printf("Updated String is : %s",Brr);

    return 0;
}