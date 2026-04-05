/*
    input:6
    output:1 * 3 * 5 *
*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
       int iCnt=0;
       for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if((iCnt%2)==0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCnt+"\t");
            }
        
        } 
        System.out.println();
    }
}

class program154
{
    public static void main(String A[])
    {
        int iValue=0;

        Scanner sObj=new Scanner(System.in);

        System.out.println("Enter the Frequency");
        iValue=sObj.nextInt();

        Pattern pObj = new Pattern();
        pObj.Display(iValue);

        pObj=null;
        sObj=null;

        System.gc();
    }
}