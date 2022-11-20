class p7 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(a);
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");
		int a=20;
		System.out.println(a);
		System.out.println(p7.a);
		System.out.println("test end");
	}
}
