class p5 
{
	int a;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		p5 obj=new p5();
		obj.test(obj);
		System.out.println("main end");
	}
	public void test(p5 b)
	{
		int a=10;
		System.out.println("test begin");
		System.out.println(a);
		System.out.println(b.a);
		System.out.println("test end");
	}
}
