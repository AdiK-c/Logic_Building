
import java.util.*;

import javax.print.DocFlavor.STRING;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt=0;
        int iCount=0;
        
        char Arr[]=str.toCharArray();

       for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>='a' && Arr[iCnt]<='z')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program250
{
    public static void main(String A[])
    {
        int iRet=0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj =scanObj.nextLine();

        StringX strObj = new StringX();

        iRet=strObj.CountSmall(sobj);

        System.out.println("Total small Charaters are :"+iRet);
   
    }
}