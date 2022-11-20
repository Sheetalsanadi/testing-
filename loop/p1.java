class p1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a=34;
		{
			if(a>9)
			{
				a++;
				System.out.println(a);
			}
			System.out.println(a);
		}
		System.out.println("main end");

	}
}
