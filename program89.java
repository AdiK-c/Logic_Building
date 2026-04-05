import java.util.*;
class Number
{
    public long CalculateFactorial(int iNo)
    {
        int i=1;
        long lFact=1;   //Important

        if(iNo<0)
        {
            iNo=-iNo;
        }

        while (i<=iNo)  //change 
        {
            lFact=lFact*i;
            i++;
        }
 
        return lFact;
    }
}
//End of Number Class

class program89
{
    public static void main(String A[])
    {
        int iValue=0;
        long lRet=0;                               
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Number nObj=new Number();
        lRet=nObj.CalculateFactorial(iValue);

        System.out.println("Factorial is :"+lRet);

        //Important
        sObj=null;
        nObj=null;

        System.gc();
    }
}