import java.util.*;
class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i=0;
        int iSum=0;

        if(iNo <0)
        {
            iNo=-iNo;
        }
                                //change
        for(i=1;(i<=(iNo/2))&&(iSum<iNo);i++) 
        {
            if((iNo%i)==0)
            {
                iSum=i+iSum;
            }
        }

        return(iSum==iNo); 

    }
}
//End of Number Class

class program84
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