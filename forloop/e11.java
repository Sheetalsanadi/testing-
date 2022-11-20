/*
	2  4  6  8
	10 12 14 16
	18 20 22 24
	26 28 30 32
					*/

class e11 
{
	public static void main(String[] args) 
	{
		int n=4;
		int a=2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
		System.out.print(a+"  ");
		a=a+2;
			}
		System.out.println();
		}
	}
}
