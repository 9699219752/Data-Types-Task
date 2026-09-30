
public class Order {

	public static void main(String[] args) {
		
		byte orderId=111;
		String C_name="Samarth";
		String P_name="Laptop";
		short P_Quantity=34;
		int P_price=65000;
		double discount=10.12;
		boolean paymentSuccessful=true;
		float ratings=4.5F;
		String O_status="Deliverd";
		byte D_distance=4;
		char C_initial='B';
		
		
		
		
		System.out.println("Order ID :"+orderId);
		System.out.println("Customer Name :"+C_name);
		System.out.println("Product Name :"+P_name);
		System.out.println("Product Quantity :"+P_Quantity);
		System.out.println("Product Price :"+P_price);
		System.out.println("Discount on Product :"+discount);
		System.out.println("Product Payment Successful :"+paymentSuccessful);
		System.out.println("Delivery Ratings :"+orderId);
		System.out.println("Order Status :"+O_status);
		System.out.println("Delivery Distance :"+D_distance);
		System.out.println("Customer Initial"+C_initial);
	}
	
}
