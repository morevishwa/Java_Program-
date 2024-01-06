import java.util.Scanner;
class ifElse {

    public static void main(String[] args) {
        
        int Number;
        System.out.println("Enter The Number ");

        Scanner object =new Scanner(System.in);
        Number=object.nextInt();

        if(Number%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
        object.close();
    }
}
