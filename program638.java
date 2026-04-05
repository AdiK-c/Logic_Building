//Toggle Bit
// iPos = 5
// iNo =        0100    1101
// iMask =      0001    0000    ^
// -------------------------------
//              0101    1101

// iNo =        0101    1101
// iMask =      0001    0000    ^
// -------------------------------
//              0100    1101

import java.util.Scanner;

class program638
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
        iNo=(iNo ^ iMask);

        System.out.println("Updated iNo is : "+iNo);



    }
}
