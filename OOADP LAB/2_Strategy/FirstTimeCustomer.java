public class FirstTimeCustomer extends DecathlonCustomer {
	
		
    FirstTimeCustomer(String n, int a) {
           super(n, a);
           iCC = new DiscountType2(); 
           
       } 
       
       public void display() { 
           
           System.out.println("\nHello Welcome to Decathlon!Congratulations for visiting our store for first time"); 
           super.display(); 
       }

   }


