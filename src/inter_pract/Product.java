package inter_pract;

public class Product {
	
	private int productId;
	private String productName;
	private double price;
	private int quantityInStock;
	
//	paramiterized constructor
	public Product(int productId,String productName,double price,int quantityInStock){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
	
//	non-paramiterized constructor
	public Product() {
		productId = 0;
		productName = "";
		price = 0;
		quantityInStock = 0;
	}
	
//	getters
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
//	setter
	public void setQuantityInStock(int new_Quantity) {
		quantityInStock = new_Quantity;
	}
	
//	method to display information together
	void displayInfo() {
		System.out.println("Book ID: "+productId+"\nBook Name: "+productName+"\nBook Price: "+price+"\nTotal Quantity: "+quantityInStock);
	}
	
	
//	main method
	public static void main(String[] args) {
		Product obj = new Product(524,"C by Java",450.50,15);
		System.out.println("Use of Parameterized Constructor");
		obj.displayInfo();
		
		Product obj2 = new Product();
		System.out.println("\nUse of non-parameterized Constructor");
		obj2.displayInfo();
		
		System.out.println("\nAfter updating Quantity");
		obj.setQuantityInStock(9);
		obj.displayInfo();
	}
	
	
	
	
	
	
	
	
	
	
}
