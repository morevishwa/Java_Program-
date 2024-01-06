import java.util.Scanner;
class Switchcase 
 
{
    public static void main(String[] args) {

        System.out.println("press 1 for Pizza");
        System.out.println("press 2 for Burger");
        System.out.println("press 3 for Ice Cream");
        System.out.println("press 4 for Fries");
        System.out.println("press 5 for coke");
        
        int Choice;
        System.out.println("Enter the choice");

        Scanner object=new Scanner(System.in);
        Choice=object.nextInt();



        switch (Choice) {
            case 1:
                System.out.println("Thank You for ordering Pizza");
                break;
            case 2:
                System.out.println("Thank You for ordering Burger");
                break; 
            case 3:
                System.out.println("Thank You for ordering Ice Cream");
                break;
            case 4:
                System.out.println("Thank You for ordering Fries");
                break;
            case 5:
                System.out.println("Thank You for ordering coke");
                break;
            
            default:
                System.out.println("You Enter Wrong Choice");
                break;
       
         
    }
    object.close();    
    }
    
    
}