class e45 
{
	public static void main(String[] args) 
	{
		int n=4;
		int space=3;
		int star=1;
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<star;k++)
			{
			System.out.print(a++ +" ");
			}
			space--;
			star+=2;
			System.out.println();
		}
	}
}
