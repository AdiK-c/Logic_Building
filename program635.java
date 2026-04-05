// 4th bit off                                              
// 1111     1111    1111    1111    1111    1111    1111    0111
// f        f       f       f       f       f       f       7
//0xfffffff7
import java.util.Scanner;

class program635
{
    public static void main(String A[])
    {
        int iNo=0,iMask=0;
        Scanner sObj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iNo=sObj.nextInt();

        iMask=0xffffff7;

        iNo=(iNo & iMask);

        System.out.println("Updated iNo is : s"+iNo);



    }
}
