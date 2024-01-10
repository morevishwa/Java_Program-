import java.util.Scanner;
class functionArg 
{
    public static void isprime(int Number) // parameters
    {
        
        int count=0;
        for(int i=2; i<Number;i++)
        {
            if(Number%i==0)
            {
                count++;
                System.out.println("Number is Not Prime ");
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Number is Prime ");
        }

    }

    // main 
    public static void main(String[] args) 
    {
        
        int Number;
        System.out.println("Enter The Number ");

        Scanner object =new Scanner(System.in);
        Number=object.nextInt();

        isprime(Number); // Arguments

    
        object.close();
    }
  
}
