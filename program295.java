import java.util.*;

class program295
{
    public static void main(String A[])
    {
        Vector <Integer>vObj=new Vector<Integer>();


        vObj.add(11);
        vObj.add(21);
        vObj.add(51);
        vObj.add(101);
        vObj.add(111);

        System.out.println(vObj);

        vObj.add(2,10);
        System.out.println(vObj);

        System.out.println(vObj.capacity());

        System.out.println(vObj.contains(101));
        System.out.println(vObj.contains(102));
    }
}