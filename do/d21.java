class d21 
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		int prod=1;
		do
		{
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num=num/10;
		}
		while(num>0);
		if(prod==sum)
		{
		System.out.println(" the given number is spy number");
		}
		else
			System.out.println(" the given number is not a spy number");
	}
}
