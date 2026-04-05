import java.util.*;
class Number
{
    public void DispalyFactor(int iNo)
    {
        int i=0;
        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo%i)==0)
            {
                System.out.println(i);
            }
        }
    }
}
//End of Number Class

class program77
{
    public static void main(String A[])
    {
        int iValue=0;                               
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Number nObj=new Number();
        nObj.DispalyFactor(iValue);

    }
}