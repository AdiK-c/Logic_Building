
import java.util.*;

class StringX
{
    public String toLowerCaseX(String str)
    {     
        int iCnt=0;   
        char Arr[]=str.toCharArray();

       for(iCnt=0;iCnt<Arr.length;iCnt++)
       {
            if(Arr[iCnt]>='A' && Arr[iCnt]<='Z')
            {
                Arr[iCnt]=(char)(Arr[iCnt]+32);
            }
       }
        return new String(Arr);     
    }
}

class program255
{
    public static void main(String A[])
    {
        String sRet=null;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj =scanObj.nextLine();

        StringX strObj = new StringX();

        sRet=strObj.toLowerCaseX(sobj);            

        System.out.println("Updated String is :"+sRet);
   
    }
}