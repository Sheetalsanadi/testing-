class p12 
{
	static int a=test();
	static int b=30+print();
	public static int test()
	{
		System.out.println("test begin");
		System.out.println("A="+a);
		print();
		System.out.println("B="+b);
		System.out.println("test end");
		return 30;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("A="+a);
		test();
		print();
		System.out.println("B="+b);
		System.out.println("main end");
	}
	public static int print()
	{
		System.out.println("print begin");
		System.out.println("A="+a);
		System.out.println("B="+b);
		System.out.println("print end");
		return 60;
	}
}
