import java.io.*;
class program75
{
    public static void main(String A[])
    {
        int iNo=0;
        int i=0;
        
        System.out.println("Enter No. :");

        BufferedReader bObj=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            iNo=Integer.parseInt(bObj.readLine());
        }
        catch(IOException iobj)
        {

        }    
        for(i=1;i<=(iNo/2);i++)
        {
            if((iNo%i)==0)
            {
                System.out.println(i);
            }
        }
    }
}