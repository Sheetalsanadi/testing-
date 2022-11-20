/*
	2  4  6  8
	3  6  9  12
	10 12 14 16
	15 18 21 24
					*/

class e18 
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=2;
		int b=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
				System.out.print(a+"  ");
				a=a+2;
				}
				else
				{
				System.out.print(b+"  ");
				b=b+3;
				}
			}
		System.out.println();
		}
	}
}
