enum Laptop
{
	Mackbook(2000),XPS(2200),Surface,ThinkPad(1800);
	private int price;

	// Whatever value we are passing above will be assigned to the variable price
	private Laptop(int price)
	{
		this.price = price;
	}
	
	private Laptop()
	{
		price=500;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
public class Demo1
{
	public static void main(String[] args)
	{	

		Laptop lap=Laptop.Mackbook;
		System.out.println(lap+" it costs Rs "+lap.getPrice());
		
		// To print the value of all the laptop
		for(Laptop l :Laptop.values()) System.out.println(l+" it costs Rs "+l.getPrice());
	}
}
