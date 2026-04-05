// iPos =14                                              
// 0000     0000    0000    0000    0000    0000    0000    0001
// iMask =iMask <<(iPos-1)
// 0000     0000    0000    0000    0010    0000    0000    0001
//iMask = iMask
// 1111     1111    1111    1111    1101    1111    1111    1111

import java.util.Scanner;

class program637
{
    public static void main(String A[])
    {
        int iNo=0,iPos=0,iMask=0;
        Scanner sObj=new Scanner(System.in);

        System.out.println("Enter the Number :");
        iNo=sObj.nextInt();

        System.out.println("Enter the Position :");
        iPos=sObj.nextInt();

        iMask=0x00000001;

        iMask=iMask<<(iPos-1);

        iMask=~(iMask);
        iNo=(iNo & iMask);

        System.out.println("Updated iNo is : "+iNo);



    }
}
