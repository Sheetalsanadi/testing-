class d22 
{
	public static void main(String[] args) 
	{
		int num=12;
		int num1=num+1;
		int count=0;
		int i=1;
		do
		{
			if(num1==i*i)
			{
				count++;
				break;
			}
			i++;
		}
		while(i<=num1/2);
		if(count==1)
		{
		System.out.println("sunny number");
		}
		else
			System.out.println("not a sunny number");
	}
}
