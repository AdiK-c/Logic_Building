/*
    iRow=6
    iCol=6

    *   *   *   *   *   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   $   $   $   $   *
    *   *   *   *   *   *
*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
       int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {   
            for(j=1;j<=iCol;j++)
            {
                if(i==1 || i==iRow || j==1 || j==iCol)
                {
                    System.out.print("*\t");   
                }
                else
                {
                    System.out.print("$\t");
                }
                
            }
            System.out.println();
        }
    } 
}

class program184
{
    public static void main(String A[])
    {
        Scanner sObj=new Scanner(System.in);

        int iValue1=0,iValue2=0;

        System.out.println("Enter the Number of rows");
        iValue1=sObj.nextInt();

        System.out.println("Enter the Number of Columns");
        iValue2=sObj.nextInt();

        Pattern pObj = new Pattern();
        pObj.Display(iValue1,iValue2);

        pObj=null;
        sObj=null;

        System.gc();
    }
}