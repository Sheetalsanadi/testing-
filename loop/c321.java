class c321     //armstrong number
{
	public static void main(String[] args) 
	{
		int n=1634;
		int num=n;
		int temp=n;
		int sum=0;
		int digit=0;
		while(n>0)
		{
			digit++;
			n=n/10;
		}
		while(num>0)
		{
			int i=digit;
			int rem=num%10;
			int prod=1;
			while(i>0)
			{
				prod=prod*rem;
				i--;
			}
			sum=sum+prod;
			num=num/10;
		}
		if(temp==sum)
		{
		System.out.println(temp+" is a armstrong number");
		}
		else
			System.out.println(temp+" is not a armstrong number");
	}
}
