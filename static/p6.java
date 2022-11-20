class p6 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(a);
		a=10;
		test();
		System.out.println(p6.a);
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		System.out.println(a);
		a=20;
		System.out.println("test end");
	}
}
