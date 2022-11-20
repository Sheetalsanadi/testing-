class p3  
{
	int a;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p3 obj=new p3();
		obj.test();
		System.out.println("main end");
	}
	public void test()
	{
		int a=10;
		System.out.println("test begin");
		System.out.println(a);
		System.out.println(this);
		System.out.println(this.a);
		System.out.println("test end");
	}
}
