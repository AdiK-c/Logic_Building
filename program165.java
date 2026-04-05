/*
    iRow=3
    iCol=4
    $   $   $   $
    $   $   $   $
    $   $   $   $
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
       int i=0,j=0;

        for(i=1;i<=iRow;i++)
        {
           for(j=1;j<=iCol;j++)
           {
             System.out.print("$\t");
           }
        
         System.out.println();
        } 
    }
}

class program165
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0;

        Scanner sObj=new Scanner(System.in);

        System.out.println("Enter the no of rows");
        iValue1=sObj.nextInt();

        System.out.println("Enter the no of Column");
        iValue2=sObj.nextInt();

        Pattern pObj = new Pattern();
        pObj.Display(iValue1,iValue2);

        pObj=null;
        sObj=null;

        System.gc();
    }
}