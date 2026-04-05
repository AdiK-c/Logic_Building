//input Hello
//output : H     e       l       l       0
import java.util.*;

class program247
{
    public static void main(String A[])
    {
         Scanner scanObj = new Scanner(System.in);
         int iCnt=0;

         System.out.println("Enter String : ");
         String sobj =scanObj.nextLine();

         char Arr[]=sobj.toCharArray();

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}