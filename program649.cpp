#include<iostream>
using namespace std;

void Display()
{
    int i=1;    //issue due to auto code
    if(i<=4)
    {
        cout<<i<<"\n";
        i++;
        Display();
    }

}

int main()
{
    Display();
    return 0;
}