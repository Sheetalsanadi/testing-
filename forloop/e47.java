class e47 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int j=1;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		int space=1;
		int star=5;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star;k++)
			{
			 System.out.print("* ");
			}
			space++;
			star-=2;
			System.out.println();
		}
	}
}
