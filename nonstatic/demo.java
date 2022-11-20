class demo 
{
	int a=test();
	demo() 
	{
		System.out.println("from demo");
	}
	demo(int a)
	{
		this();
		this.a=a;
		System.out.println("from demo(int)");
		System.out.println(a);
	}
	{
		System.out.println("IIB");
	}
	public int test()
	{
		System.out.println("test begin");
		System.out.println(a);
		System.out.println("test end");
		return 30;
	}
}
