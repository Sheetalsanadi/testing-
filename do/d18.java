class d18 
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int sum=0;
		do
		{
			int fact=1;
			int rem=num%10;
			while(rem>0)
			{
				fact=fact*rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		while(num>0);
		if(temp==sum)
		{
		System.out.println(temp+" is a strong number");
		}
		else
			System.out.println(temp+" is not a strong number");
	}
}
