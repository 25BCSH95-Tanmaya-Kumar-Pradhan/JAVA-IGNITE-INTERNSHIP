
class Mobile{
	String brand;
	private double price;
	int storage;
	
	void setPrice(double price)
	{
		this.price=price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	Mobile (String brand,int storage)
	{
		this.brand=brand;
		this.storage=storage;
	}
	
	void display()
	{
		System.out.println("MOBILE DETAILES:");
		System.out.println("Brand: "+brand);
		System.out.println("Price: Rs."+getPrice());
		System.out.println("Storage: "+storage);
		System.out.println("-------------------------");
	}
}
public class Mobile_details {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile1 = new Mobile("Samsung",128);
		mobile1.setPrice(30000);
		Mobile mobile2 = new Mobile("Oppo",256);
		mobile2.setPrice(50000);
		mobile1.display();
		mobile2.display();
	}

}
