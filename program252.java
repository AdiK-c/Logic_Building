
import java.util.*;

import javax.print.DocFlavor.STRING;

class StringX
{
    public String Update(String str)
    {        
        char Arr[]=str.toCharArray();

        Arr[0]='_';

        String temp=new String(Arr);

        return temp;
    }
}

class program252
{
    public static void main(String A[])
    {
        String sRet=null;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj =scanObj.nextLine();

        StringX strObj = new StringX();

        sRet=strObj.Update(sobj);

        System.out.println("Update String is :"+sRet);
   
    }
}