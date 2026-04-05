import java.util.*;

class program301
{
    public static void main(String A[])
    {
        Hashtable <String,Integer>hObj=new Hashtable<String,Integer>();

        hObj.put("PPA",27000);
        hObj.put("LB",28000 );
        hObj.put("LSP", 29000);
        hObj.put("Python",30000);

        System.out.println(hObj);

        System.out.println(hObj.keys());
        Enumeration eObj = hObj.keys();

        while (eObj.hasMoreElements())
        {
            System.out.println(eObj.nextElement());
            System.out.println(hObj.get(eObj.nextElement()));
        }

    }
}