class  p4
{
	int a;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p4 obj=new p4();
		obj.test();
		p4 obj1=new p4();
		obj1.test();
		System.out.println("main end");
	}
	public void test()
	{
		int a=10;
		System.out.println("test begin");
		System.out.println(this);
		System.out.println(this.a);
		System.out.println("test end");
	}
}
