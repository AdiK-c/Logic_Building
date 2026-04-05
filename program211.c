#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[]={'H','E','L','L','O','\0'};

    printf("%s\n",Arr);         //HELLO
    printf("%d\n",sizeof(Arr)); //6
    printf("%d\n",strlen(Arr)); //5

    return 0;
}