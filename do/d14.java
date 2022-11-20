class d14 
{
	public static void main(String[] args) 
	{
		int c=0;
		int num=13;
		int i=2;
		do
		{
			if(num%i==0)
			{
				c++;
				break;
			}
			i++;
		}
		while(i<num);
		if(c==0)
		{
		System.out.println("prime");
		}
		else
		System.out.println("not prime");
	}
}
