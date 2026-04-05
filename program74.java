//Cheacked Exception
import java.io.*;
class program74
{
    public static void main(String A[])
    {
        int iNo=0;
        int i=0;
        
        System.out.println("Enter No. :");

        BufferedReader bObj=new BufferedReader(new InputStreamReader(system.in));
        iNo=Integer.parse(bObj.readLine());

        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo%i)==0)
            {
                System.out.println(i);
            }
        }
    }
}