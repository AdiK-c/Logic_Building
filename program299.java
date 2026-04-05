import java.util.*;

class program299
{
    public static void main(String A[])
    {
        LinkedList <Double>vObj=new LinkedList<Double>();


        vObj.add(10.5);
        vObj.add(30.7);
        vObj.add(12.6);
        vObj.add(78.9);
        vObj.add(90.7);

        System.out.println(vObj);


        vObj.addFirst(10.0);
        vObj.addLast(100.0);

        System.out.println(vObj);

        vObj.remove(2);
        System.out.println(vObj);

        Iterator iObj=vObj.iterator();

        while(iObj.hasNext())
        {
            System.out.println(iObj.next());
        }

        vObj.clear();
    }
}