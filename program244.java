//input Hello
//output : H     e       l       l       0
import java.util.*;

import javax.print.DocFlavor.STRING;

class StringX
{
    public void Display(String str)
    {
        int iCnt=0;
       for(iCnt=0;iCnt<str.length();iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        } 
    }
}

class program244
{
    public static void main(String A[])
    {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj =scanObj.nextLine();

        StringX strObj = new StringX();

        strObj.Display(sobj);
   
    }
}