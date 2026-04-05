//input Hello
//output : H     e       l       l       0
import java.util.*;

class program243
{
    public static void main(String A[])
    {
        int iCnt=0;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str =sObj.nextLine();

        for(iCnt=0;iCnt<str.length();iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }
    }
}