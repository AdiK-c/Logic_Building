import java.io.*;
class program76
{
    //Not a good prgramming
    public static void main(String A[]) throws IOException
    {
        int iNo=0;
        int i=0;
        
        System.out.println("Enter No. :");

        BufferedReader bObj=new BufferedReader(new InputStreamReader(System.in));

        iNo=Integer.parseInt(bObj.readLine());
       
        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo%i)==0)
            {
                System.out.println(i);
            }
        }
    }
}