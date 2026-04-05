#include<stdio.h>
void strrevX(char *str)
{
    char temp='\0';

    char *Start=str;
    char *End=str;

    while ((*End!='\0'))
    {
        End++;
    }

    End--;
    while(Start<End)
    {
        temp=*Start;
        *Start=*End;
        *End=temp;

        Start++;
        End--;
    }
    
}
int main()
{
    char Arr[50]={'\0'};

    printf("Enter the String :\n");
    scanf("%[^'\n']s",Arr);

    strrevX(Arr);

    printf("Updated String is : %s",Arr);

    return 0;
}