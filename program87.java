import java.util.*;
class Number
{
    public int CalculateFactorial(int iNo)
    {
        int i=0;
        int iFact=1;

        if(iNo<0)
        {
            iNo=-iNo;
        }

        for(i=1;i<=iNo;i++) //by sir but my is same
        {

            iFact=iFact*i;
        }
 
        return iFact;
    }
}
//End of Number Class

class program87
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;                               
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Number nObj=new Number();
        iRet=nObj.CalculateFactorial(iValue);

        System.out.println("Factorial is :"+iRet);

        //Important
        sObj=null;
        nObj=null;

        System.gc();
    }
}