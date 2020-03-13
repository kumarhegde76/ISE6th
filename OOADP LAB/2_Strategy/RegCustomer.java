class RegCustomer extends DecathlonCustomer {

	RegCustomer(String n, int a) {
		super(n, a);
		iCC = new DiscountType1(); 
		
	} 
	
	public void display() { 
		
		System.out.println("\nHello Regular Customer! Welcome Back..."); 
		super.display(); 
	}

}
