public class StrategyClientMain {

	public static void main(String[] args) {
		
		double mrptotal = 8000.50; 
		RegCustomer oRC = new RegCustomer("Anurag", 20); 
		oRC.calculateDiscount(mrptotal);	
		oRC.display();			
		FirstTimeCustomer oFTC = new FirstTimeCustomer("Anupam", 27); 
		oFTC.calculateDiscount(mrptotal);	
		oFTC.display(); 
	}

}
