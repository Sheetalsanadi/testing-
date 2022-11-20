class vehicle 
{
	int id;
	int speed;
	int gear;
	vehicle()
	{}
	vehicle(int id,int speed,int gear)
	{
		this.id=id;
		this.speed=speed;
		this.gear=gear;
	}
	void vehicledetails()
	{
		System.out.println("Vehicle Details");
		System.out.println("Vehicle ID: "+id);
		System.out.println("Vehicle Speed: "+speed);
		System.out.println("Vehicle Gear: "+gear);
	}
}
