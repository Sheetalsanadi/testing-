/*
	2  3  4  6
	6  9  8  12
	10 15 12 18
	14 21 16 24
					*/

class e17 
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
				if(j%2==0)
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
