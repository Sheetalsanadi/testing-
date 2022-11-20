/*
	A 1 B 2
	C 3 F 4
	E 5 F 6
	G 7 H 8
				*/

class e16 
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
				if(j%2==0)
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
