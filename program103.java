// OOP Design

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int iNo)
    {
        iSize=iNo;
        Arr=new int[iSize];
    }
}

class program103
{
    public static void main( String A[])
    {
        ArrayX aObj= new ArrayX(3);
    }
}