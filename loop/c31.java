class c31     //perfect number
{
	public static void main(String[] args) 
	{
		int num=153;
		int i=1;
		int sum=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
		System.out.println(num+" is a perfect number");
		}
		else
		System.out.println(num+" is not a perfect number");
	}
}
