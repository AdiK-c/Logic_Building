import java.util.*;
class Digit
{
    public void DisplayDigits(int iNo)
    {
        int idigit=0;
        while(iNo!=0)
        {
            idigit=iNo%10;
            System.out.println(idigit);
            iNo=iNo/10;
        }
    }
}
class program90
{
    public static void main(String A[])
    {
        int iValue=0;                              
        
        System.out.println("Enter No. :");

        Scanner sObj=new Scanner(System.in);
        iValue=sObj.nextInt();

        Digit dObj=new  Digit();
        dObj.DisplayDigits(iValue);

        //Important
        sObj=null;
        dObj=null;

        System.gc();
    }
}