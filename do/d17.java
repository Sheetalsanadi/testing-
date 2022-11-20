class d17 
{
	public static void main(String[] args) 
	{
		int num=9;
		int sum=0;
		int sq=num*num;
		do
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		while(sq>0);
		if(num==sum)
		{
		System.out.println(num+" is a neon number");
		}
		else
		System.out.println(num+" is not a neon number");
	}
}
