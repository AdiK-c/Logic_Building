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
    Arithmatic <int> aObj1(11,10);       
    Arithmatic <double> aObj2(101.5,50.3);       
     
    cout<<aObj1.Addition()<<"\n";
    cout<<aObj1.Substraction()<<"\n";

    cout<<aObj2.Addition()<<"\n";
    cout<<aObj2.Substraction()<<"\n";
    return 0;   
}