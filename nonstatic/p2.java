class p2 
{
	int a;
	static int b;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p2 obj=new p2();
		obj.test();
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println("main end");
	}
	public void test()
	{
		System.out.println("test begin");
		System.out.println(b);
		System.out.println(a);
		System.out.println("test end");
	}
}
