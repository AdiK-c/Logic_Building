//OOP Approach

#include<iostream>
using namespace std;

class Arithmatic
{
    public:
        int iNo1;
        int iNo2;

    Arithmatic(int A,int B)
    {
        iNo1=A;
        iNo2=B;
    }

    int Addition()
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }

    int Substraction()
    {
        int iAns=0;
        iAns=iNo1-iNo2;
        return iAns;
    }

};

int main()
{
    Arithmatic aObj(11,10);
     
    cout<<aObj.Addition()<<"\n";
    cout<<aObj.Substraction()<<"\n";

    return 0;   
}