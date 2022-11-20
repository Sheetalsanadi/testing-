class p2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		add();
			System.out.println("main end");
	}
	public static void add()
	{
		System.out.println("add begin");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("add end");
	}
}
