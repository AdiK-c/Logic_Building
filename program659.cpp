//input 4
//output 4+3+2+1=10
#include<iostream>
using namespace std;

int Addition(int iNo)
{
    int isum=0;
   while(iNo>=1)
   {
    isum=isum+iNo;
    iNo--;
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