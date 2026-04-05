/*
    iRow=4
    iCol=4

    a   b   c   d
    a   b   c   d
    a   b   c   d
    a   b   c   d
*/
import java.util.Scanner;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
       int i=0,j=0;
       char ch='a';
        for(i=1;i<=iRow;i++)
        {   
            ch='a';
            for(j=1;j<=iCol;j++,ch++)
            {
                System.out.printf("%c\t",ch);
            }
            System.out.println();
        }
    } 
}

class program180
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