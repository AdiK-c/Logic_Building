/*
    input:6
    output:-6 -5 -4 -3 -2 -1 0
*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
       int iCnt=0;
       for(iCnt=-iNo;iCnt<=0;iCnt++)
        {
            System.out.print(iCnt+"\t");
        } 
        System.out.println();
    }
}

class program158
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