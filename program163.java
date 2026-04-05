/*
    input:8
    output:1 * 2 * 3 * 4 *
           1 2 3 4 5 6 7 8
*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
       int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if((iCnt)%2==0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(((iCnt/2)+1)+"\t");        //without using the new variable like icount we give direct mathematical eqution 
                                                            //in this eqa the iCnt/2 we give rem and +1
                
            }
        } 
        System.out.println();
    }
}

class program163
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