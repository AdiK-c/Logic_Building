#include<stdio.h>

void Dispaly(int *ptr)
{
    int iCnt=0;
    
    for(iCnt=0;iCnt<4;iCnt++,*ptr++)
    {
        printf("%d\n",*ptr);
    }
    
}
int main()
{
    int Arr[]={10,20,30,40};
    Dispaly(Arr);               //Display(100)

    return 0;
}