class p8 
{
	static int a;
	static int b;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(a);
		System.out.println(b);
		a=30;
		a=test();
		System.out.println(a);
		System.out.println(b);
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("test begin");
		int a=60;
		b=40;
		System.out.println(a);
		System.out.println(p8.a);
		System.out.println("test end");
		return 90;
	}
}
