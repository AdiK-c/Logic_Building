//OOP Approach(Specific)

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
    Arithmatic aObj1(11,10);
    Arithmatic aObj2(101,50);
     
    cout<<aObj1.Addition()<<"\n";
    cout<<aObj1.Substraction()<<"\n";

    cout<<aObj2.Addition()<<"\n";
    cout<<aObj2.Substraction()<<"\n";
    return 0;   
}