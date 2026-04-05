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
    

} //End of ArrayX class

class program107
{
    public static void main( String A[])
    {
        ArrayX aObj1= new ArrayX(5);
        aObj1.Accpet();
        aObj1.Display();

        ArrayX aObj2= new ArrayX(7);
        aObj2.Accpet();
        aObj2.Display();


    }
}