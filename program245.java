//input Hello
//output : H     e       l       l       0
import java.util.*;

class program245
{
    public static void main(String A[])
    {
         Scanner scanObj = new Scanner(System.in);

         System.out.println("Enter String : ");
         String sobj =scanObj.nextLine();

         char Arr[]=sobj.toCharArray();

         System.out.println(sobj.length());

         System.out.println(Arr.length);
    }
}