#include<stdio.h>

void Dispaly(int *Arr)          //changed only name of ptr to Arr
{
    int iCnt=0;
    
    for(iCnt=0;iCnt<4;iCnt++,*Arr++)
    {
        printf("%d\n",*Arr);
    }
    
}
int main()
{
    int Arr[]={10,20,30,40};
    Dispaly(Arr);               //Display(100)

    return 0;
}