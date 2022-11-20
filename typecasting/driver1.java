class driver1 
{
	public static void main(String[] args) 
	{
		B x=new B();
		A y=x;
		B z=(B)y;
		System.out.println(z.a);
		System.out.println(z.b);
	}
}
