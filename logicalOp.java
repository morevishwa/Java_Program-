import java.util.Scanner;
class logicalOp 
{
    public static void main(String[] args) {

        int Number;
        System.out.println("Enter The Number ");

        Scanner object =new Scanner(System.in);
        Number=object.nextInt();

        //Logical AND &&

       //if(Number>10 && Number<50)
        // {
        //     System.out.println("Entered Succesfully ");
        // }
        // else
        // {
        //     System.out.println(" Condition fail ");
        // }
        

        //Logical OR ||     

        // if(Number<10 || Number<5)
        // {
        //     System.out.println("Entered Succesfully ");
        // }
        // else
        // {
        //      System.out.println(" Condition fail ");    
        // }
        
      //  Logical NOT !

        
        if (!(Number>10))
        {
            System.out.println("Entered Succesfully ");
        }
        else
        {
            System.out.println(" Condition fail ");
        }
         
        

        object.close();
    }
   
    
}