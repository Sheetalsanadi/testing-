class p3 
{
	public static void main(String[] args) 
	{
		System.out.println("from p3");
		p1.test();
		test();
		p3.test();
	}
	public static void test()
	{
		System.out.println("begin");
		System.out.println("end");
	}
}
