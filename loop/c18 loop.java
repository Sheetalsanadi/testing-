class c18
{
	public static void main(String[] args) 
	{
	int n=10;
	int count=0;
	int i=1;
	while(i<=n/2)
		{
			int a=i*i;
			if(n==a)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==1)
		{
		System.out.println(i+ " is a square root of "+n);
		}
		else
			System.out.println(n+" is not a perfect square"); 

	}
}
