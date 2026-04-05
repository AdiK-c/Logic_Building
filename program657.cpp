//input 4
//output 1+2+3+4=10
#include<iostream>
using namespace std;

int Addition(int iNo)
{
    int isum=0,i=0;
   while(i<=iNo)
   {
    isum=isum+i;
    i++;
   }
   return isum; 
}

int main()
{
    int iRet=0;
    iRet=Addition(4);
    cout<<iRet;
    return 0;
}