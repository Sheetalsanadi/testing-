class p4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
			System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		print();
		System.out.println("test end");
	}
	public static void print()
	{
		System.out.println("print begin");
		System.out.println("print end");
	}
}
