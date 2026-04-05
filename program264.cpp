#include<iostream>
using namespace std;

int Maximum(int No1,int No2)
{
    if(No1<No2)
    {
        return No2;
    }
    else
    {
        return No1;
    }
}

int main()
{
    int iValue1=10,iValue2=11,iRet=0;

    iRet=(iValue1,iValue2);

    cout<<"Maximum Number is:"<<iRet;
    
    return 0;

}