/*
	A B C D
	1 2 3 4
	E F G H
	5 6 7 8
				*/

class e15 
{
	public static void main(String[] args) 
	{
		int n=4;
		char ch='A';
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
				System.out.print(ch+"  ");
				ch++;
				}
				else
				{
				System.out.print(a+"  ");
				a++;
				}
			}
		System.out.println();
		}
	}
}
