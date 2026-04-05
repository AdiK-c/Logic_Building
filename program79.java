import java.util.*;
class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i=0;
        int iSum=0;
        for(i=1;i<=(iNo/2);i++) //done by me
        {
            if((iNo%i)==0)
            {
                iSum=i+iSum;
            }
        }
        if(iSum==iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
//End of Number Class

class program79
{
    public static void main(String A[])
    {
        int iValue=0;
        Boolean bRet=false;                               
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Number nObj=new Number();
        bRet=nObj.CheckPerfect(iValue);

        if(bRet==true)
        {
            System.out.println(iValue+" is Perfect Number");
        }
        else
        {
            System.out.println(iValue+" is not Perfect Number");
        }

        //Important
        sObj=null;
        nObj=null;

        System.gc();
    }
}