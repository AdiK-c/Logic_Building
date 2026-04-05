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
}

class program106
{
    public static void main( String A[])
    {
        ArrayX aObj1= new ArrayX(5);
        System.out.println(aObj1.iSize);        //Error

        //Bad Code(Need of Access specifiers)
        aObj1.size=11;                          //Error
        aObj.Arr=null;                          //Error

        ArrayX aObj2= new ArrayX(7);
        System.out.println(aObj2.iSize);        //Error
    }
}