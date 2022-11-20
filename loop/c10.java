class c10 
{
	public static void main(String[] args) 
	{
		int num=567890;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
