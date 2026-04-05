//OOP Approach (Generic)

#include<iostream>
using namespace std;
template <class T>

class Arithmatic
{
    public:
        T iNo1;
        T iNo2;

    Arithmatic(T A,T B)
    {
        iNo1=A;
        iNo2=B;
    }

    T Addition()
    {
        T iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }

    T Substraction()
    {
        T iAns=0;
        iAns=iNo1-iNo2;
        return iAns;
    }

};

int main()
{
    Arithmatic aObj1(11,10);        //Error
    Arithmatic aObj2(101,50);       //Error
     
    cout<<aObj1.Addition()<<"\n";
    cout<<aObj1.Substraction()<<"\n";

    cout<<aObj2.Addition()<<"\n";
    cout<<aObj2.Substraction()<<"\n";
    return 0;   
}