import java.util.Scanner;

class program629
{
    public static void main(String A[])
    {
        int iNo=0,iMask=0,iResult=0;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Number :");
        iNo=sobj.nextInt();

        iMask =0x02000000;

        iResult=iNo & iMask;
        if(iResult == iMask)
        {
            System.out.println("Twenty Six bit is on.");
        }
        else
        {
            System.out.println("Twenty six bit is off.");
        }
    }
    
}

 
    
        