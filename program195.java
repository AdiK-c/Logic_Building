/*
    iRow=4
    iCol=4
     
    *
    *   *
    *   *   *
    *   *   *   *
*/
import java.util.Scanner;

class Pattern
{
    //Filter for Sqaure Matrix
    public void Display(int iRow,int iCol)
    {
       int i=0,j=0;

        if(iRow!=iCol)
        {
            System.out.println("Invalid Input...");
            System.out.println("Row And Column Should be Same...");
            return;
        }
        for(i=1;i<=iRow;i++)
        {   
            for(j=1;i>=j;j++)
            {
                    System.out.print("*\t");   
            }
            System.out.println();
        }
    } 
}

class program195
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