class e43 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int j=1;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int j=0;j<n-1;j++)
			{
				if(i==0 || i==n-1 || j==n-2)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
