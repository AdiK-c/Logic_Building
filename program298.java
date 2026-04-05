import java.util.*;

class program298
{
    public static void main(String A[])
    {
        ArrayList <String>vObj=new ArrayList<String>();


        vObj.add("C");
        vObj.add("C++");
        vObj.add("Java");
        vObj.add("Python");
        vObj.add("c#");
        vObj.add("Java");

        System.out.println(vObj);

        vObj.add(2,"LSP");
        System.out.println(vObj);

        System.out.println(vObj.contains("LSP"));
        System.out.println(vObj.contains("Unix"));

        vObj.remove(6);
        System.out.println(vObj);

        Iterator iObj=vObj.iterator();

        while(iObj.hasNext())
        {
            System.out.println(iObj.next());
        }

        vObj.clear();
    }
}