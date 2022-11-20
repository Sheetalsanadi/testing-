class car 
{
	String brand;
	String colour;
	double mileage;
	double price;
	car()
	{
		
	}
	car(String brand,String colour,double mileage,double price)
	{
		this.brand=brand;
		this.colour=colour;
		this.mileage=mileage;
		this.price=price;
	}
	car(String brand,String colour,double price)
	{
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}
	car(String brand,double mileage,double price)
	{
		this.brand=brand;
		this.mileage=mileage;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Car Details");
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Colour: "+colour);
		System.out.println("Car Mileage: "+mileage);
		System.out.println("Car Price: "+price);
		System.out.println("----------------");
	}
}
