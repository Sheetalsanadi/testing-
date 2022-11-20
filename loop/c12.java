class  c12
{
	public static void main(String[] args) 
	{
		int a=5678;
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a/=10;
		}
		System.out.println(sum);
	}
}
