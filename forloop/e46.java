class e46 
{
	public static void main(String[] args) 
	{
		int n=4;
		int space=0;
		int star=7;
		for(int i=0;i<n;i++)
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