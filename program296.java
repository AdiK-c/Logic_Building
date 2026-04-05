import java.util.*;

class program296
{
    public static void main(String A[])
    {
        Vector <String>vObj=new Vector<String>();


        vObj.add("C");
        vObj.add("C++");
        vObj.add("Java");
        vObj.add("Python");
        vObj.add("c#");
        vObj.add("Java");

        System.out.println(vObj);

        vObj.add(2,"LSP");
        System.out.println(vObj);

        System.out.println(vObj.capacity());

        System.out.println(vObj.contains("LSP"));
        System.out.println(vObj.contains("Unix"));

        vObj.remove(6);
        System.out.println(vObj);
    }
}