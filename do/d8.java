class d8 
{
	public static void main(String[] args) 
	{
		int a=12345;
		int sum=0;
		do
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		while (a>0);
		System.out.println(sum);
	}
}
