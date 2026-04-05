#include<iostream>
using namespace std;

void Display(int iNo)
{
    static int i=1;
    if(i<=iNo)
    {
        i++;
        Display(iNo);       //types of recurssion -> 1.Head  2.Tail the given code is head recurssion
        cout<<i<<"\n";
    }

}

int main()
{
    Display(3);
    return 0;
}