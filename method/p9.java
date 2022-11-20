class p9 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int res=mul(10,20);
		int result=add(res,15);
		System.out.println(result);
		System.out.println("main end");
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int mul(int d,int e)
	{
		int f=d*e;
		return f;
	}
}
