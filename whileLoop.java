class whileLoop {
    
    public static void main(String[] args)
    {
        //initialization
        int Number=1;
        boolean condition=true;

        //condition        
        while(condition)
        {
            if(Number<=5)
            {
                System.out.println("Number is "+Number);
                condition=true;
            }
            else
            {
                condition=false;
            }
           // increment or decrement 
           
            Number++;
        }

    }
}
