#include<iostream>
using namespace std;

template <class T>
T Maximun(T Arr[],int iSize)
{
    int iCnt=0;
    T iMax;

    iMax=Arr[0];

    for(iCnt=0;iCnt<iSize;iCnt++)
    {
        if(iMax<Arr[iCnt])
        {
            iMax=Arr[iCnt];
        }
    }

    return iMax;

}

int main()
{
    float Brr[]={10.1f,20.2f,30.3f,40.4f,50.5f};
    float fRet=0.0f;

    fRet=Maximun(Brr,5);

    cout<<"Maximum number is:"<<fRet<<"\n";

    return 0;   
}