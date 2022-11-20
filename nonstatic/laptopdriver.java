class laptopdriver 
{
	public static void main(String[] args) 
	{
		laptop l1=new laptop();
		l1.brand=("dell");
		l1.ram=16;
		l1.hdd=512;
		l1.cost=59999.99;
		l1.display();
		laptop l2=new laptop();
		l2.brand=("hp");
		l2.ram=32;
		l2.hdd=1000;
		l2.cost=23999.99;
		l2.display();
	}
}
