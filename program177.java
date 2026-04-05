/*
    Input : 8
    Output :    1       A       3       B       5       C       7       D
    index :     1       2       3       4       5       6       7       8   
*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt=0;
        char ch='A';
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {   
            if(iCnt%2==0)
            {
                System.out.printf("%c\t",ch);
                ch++;
            }
            else
            {
                System.out.printf("%d\t",iCnt);
            }
        }
        System.out.println();
    } 
}

class program177
{
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter the Frequency:");
        iValue=sObj.nextInt();

        Pattern pObj = new Pattern();
        pObj.Display(iValue);

        pObj=null;
        sObj=null;

        System.gc();
    }
}