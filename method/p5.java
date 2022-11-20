class p5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		add(10,20);
		add(5,10);
			System.out.println("main end");
	}
	public static void add(int a,int b)
	{
		System.out.println("add begin");
		int c=a+b;
		System.out.println(c);
		System.out.println("add end");
	}
}
