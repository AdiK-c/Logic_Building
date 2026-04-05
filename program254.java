
import java.util.*;


class StringX
{
    public String Update(String str)
    {        
        char Arr[]=str.toCharArray();

        Arr[0]='_';
        return new String(Arr);     
    }
}

class program254
{\
    public static void main(String A[])
    {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String sobj =scanObj.nextLine();

        StringX strObj = new StringX();

        sobj=strObj.Update(sobj);               //change in code we change the obj of the old tsring but now if we waant to disPLAY THA OLD STRING WE CAN'T

        System.out.println("Update String is :"+sobj);
   
    }
}