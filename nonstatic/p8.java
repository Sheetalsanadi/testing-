class p8 
{
	int a=test();
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p8 obj=new p8();
		System.out.println(obj.a);
		obj.a=60;
		obj.test();
		p8 obj1=new p8();
		System.out.println(obj1.a);
		System.out.println("main end");
	}
	public int test()
	{
		System.out.println("test begin");
		System.out.println(a);
		System.out.println("test end");
		return 30;
	}
}
