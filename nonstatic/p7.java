class p7
{
	int a=test();
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p7 obj=new p7();
		System.out.println(obj.a);
		obj.test();
		System.out.println("main end");
	}
	public int test()
	{
		int a=10;
		System.out.println("test begin");
		System.out.println(a);
		System.out.println("test end");
		return 30;
	}
}
