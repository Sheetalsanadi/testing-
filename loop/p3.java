class p3 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int sum=0;
		while(a<b)
		{
			b=b-a;
			sum=sum+a;
			a++;
		}
		System.out.println(sum);
	}
}
