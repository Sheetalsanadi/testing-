class p10 
{
	static int a=test();
	public static int test()
	{
		System.out.println("test begin");
		System.out.println("A="+a);
		System.out.println("test end");
		return 30;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("A="+a);
		System.out.println("main end");
	}
}
