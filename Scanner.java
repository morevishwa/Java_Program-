import java.util.Scanner;

class input
{
    public static void main(String[] args) {
        
        int Number1;
        int Number2;
        int result;

        Scanner object=new Scanner(System.in);

        System.out.println("Enter Frist Number ");
        Number1=object.nextInt();

        System.out.println("Enter Second Number ");
        Number2=object.nextInt();

        result=Number1+Number2;
        System.out.println("Result is "+ result);

        object.close();
    }
}