//input 4
//output 4+3+2+1=10
#include<iostream>
using namespace std;

int Addition(int iNo)
{
    static int isum=0;
    static int i=1;
   if(i<=iNo)
   {
    isum=isum+i;
    i++;
    Addition(iNo);
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
