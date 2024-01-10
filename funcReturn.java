import java.util.Scanner;
class funcReturn 
{
    public static int SumOfEven(int input) 
    {
        int sum=0;
        for(int i=2;i<=input;i=i+2)    //for(int i=1;i<=input;i++)
        {
            sum=sum+i;                       //if(i%2==0)
                                            // {
                                                 //sum=sum+i;
                                            //  }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int Number;
        System.out.println("Enter The Number ");

        Scanner object =new Scanner(System.in);
        Number=object.nextInt();

        
        int result=SumOfEven(Number); //sumOfEven function result save in result variable

        System.out.println("Sum of Even is " +result);

    
        object.close();

    }
    
    
}
