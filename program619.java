import java.util.Scanner;

class program619
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);
        int no=0;
        
        System.out.println("Enter the Number");
        no=sobj.nextInt();

        int iDigit=0;
        while ((no != 0))
        {
            iDigit=no%2;
            System.out.print(iDigit);
            no=no/2;
        }

    }
}