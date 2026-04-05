import java.util.*;
class Digit
{
    public int SumDigits(int iNo)
    {
        int idigit=0;
        int iSum=0;
        while(iNo!=0)
        {
            idigit=iNo%10;
           iSum=iSum+idigit;
            iNo=iNo/10;
        }
        return iSum;    
    }
}
class program91
{
    public static void main(String A[])
    {
        int iValue=0;  
        int iRet=0;                            
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Digit dObj=new Digit();
        iRet=dObj.SumDigits(iValue);

        System.out.println("Addition is:"+iRet);

        //Important
        sObj=null;
        dObj=null;

        System.gc();
    }
}