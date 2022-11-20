class p8 
{
	public static void main(String[] args) 
	{
		largest(10,20,30);
	}
		public static void largest(int a,int b,int c)
	{
			if(a>b && a>c)
		System.out.println(a);
			if(b>c && b>a)
		System.out.println(b);
			if(c>a && c>b)
		System.out.println(c);
	}
}
