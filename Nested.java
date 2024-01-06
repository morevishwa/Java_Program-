import java.util.Scanner;

class Nested 
{
    public static void main(String[] args) {
        
        int Age;
        System.out.println("Enter Your Age ");

        Scanner object =new Scanner(System.in);
        Age=object.nextInt();


        if (Age>=18) 
        {
            if (Age>30) 
            {
                System.out.println("You Are Eligible voting panel above 30");   
            }
            else
            {
                System.out.println("You Are Eligible voting panel above 18-29");   
            }
        }
        else
        {
            if (Age>15) 
            {
                System.out.println("You Are Not Eligible for  voting  wait until you become 18 Years");      
            }
            else
            {
                System.out.println("You Are Not Eligible voting You are too small");   
            }
        }
        object.close();
    
    }
    
}