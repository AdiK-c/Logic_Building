// OOP Design
import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int iNo)
    {
        System.out.println("Inside Constructor");
        iSize=iNo;
        Arr=new int[iSize];
    }

    public void Accpet()
    {
        Scanner sObj=new Scanner(System.in);
        int i=0;

        System.out.println("Enter the Elements of Array :");

        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sObj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Elemenst of Array are :");
        int i=0;
        
        for(i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }

    public float Average()
    {
        int i=0,iSum=0;
        for(i=0;i<Arr.length;i++)
        {
            iSum=iSum+Arr[i];
        }
        return iSum/iSize;
    }
    

} //End of ArrayX class

class program108
{
    public static void main( String A[])
    {
        float fRet=0.0f;

        ArrayX aObj1= new ArrayX(5);
        aObj1.Accpet();
        aObj1.Display();
        fRet=aObj1.Average();
        System.out.println("Average is :"+fRet);

    }
}