import java.util.Scanner;
class elseIf 
{
    public static void main(String[] args) 
    {


        int Number;
        System.out.println("Enter The Number ");

        Scanner object =new Scanner(System.in);
        Number=object.nextInt();

        if (Number>0) 
        {
            System.out.println("Number is positive");
        }
        else if(Number<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }

        object.close();
    }
}
