class car extends vehicle
{
	String colour;
	String brand;
	double price;
	car()
	{}
	car(int id,int speed,int gear,String colour,String brand,double price)
	{
		this.id=id;
		this.speed=speed;
		this.gear=gear;
		this.colour=colour;
		this.brand=brand;
		this.price=price;
	}
	void cardetails()
	{
		System.out.println("Car Details");
		System.out.println("Car ID: "+id);
		System.out.println("Car Speed: "+speed);
		System.out.println("Car Gear: "+gear);
		System.out.println("Car Colour: "+colour);
		System.out.println("Car Brand: "+brand);
		System.out.println("Car Price: "+price);
	}
}
