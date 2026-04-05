import java.util.*;

class ArrayX
{
    public int CountEven(int Brr[])
    {
        int i=0,iCount=0;

        for(i=0;i<Brr.length;i++)
        {
            if((Brr[i]%2)==0)
            {
                iCount++;
            }
        }
        return iCount;
    }
    public void Display(int Brr[])
    {
        int i=0;
        for(i=0;i<Brr.length;i++)
        {
            System.out.println(Brr[i]);
        }
    }
}

class program101
{
    public static void main( String A[])
    {
        Scanner sObj=new Scanner(System.in);
        int iSize=0,i=0,iRet=0;

        System.out.println("Enter the Size of Array :");
        iSize=sObj.nextInt();

        int Arr[]=new int[iSize];

        System.err.println("Enter the elements :");

        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sObj.nextInt();

        }

        ArrayX aobj=new ArrayX();
        aobj.Display(Arr);

        iRet=aobj.CountEven(Arr);

        System.out.println("total number of even number :"+iRet);

        //Important
        aobj=null;
        Arr=null;
        sObj=null;

        System.gc();
        
    }
}
