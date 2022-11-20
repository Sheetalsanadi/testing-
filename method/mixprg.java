class mixprg 
{
	public static void main(String[] args) 
	{
		
		boolean f2=neon(9);
		if(f2)
		{
			System.out.println("the number is a neon number");
		}
		else
			{
				System.out.println("the number is not a neon number");
			}
				boolean f1=prime(13);
		if(f1)
		{
			System.out.println("the number is a prime");
		}
		else
		{
			System.out.println("the number is not a prime");
		}
	boolean pali=palindrome(1221);
     if(pali)
		{
			System.out.println("the given number is palindrome");
		}
			else
	{
			System.out.println("the given number is not a palindrome");
	}
	boolean strg=strong(int num);
		if(strg)
		{
			System.out.println("the given number is strong");
		}
			else
		{
			System.out.println("the given number is not a strong");
		}
	}
	public static boolean palindrome(int num)
	{
		int pali=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==pali)
		{
		return true;
		}
	else
		{
		return false;
		}
	}
	public static boolean prime(int num)
	{
		int c=0;
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				c++;
				break;
			}
			i++;
		}
		if(c==0)
		{
		return true;
		}
		else
		return false;
}
public static boolean neon(int num)
	{
		int sum=0;
		int sq=num*num;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(num==sum)
		{
		return true;
		}
		else
		return false;
}
		public static boolean strong(int num)
	{
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int fact=1;
			int rem=num%10;
			while(rem>0)
			{
				fact=fact*rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}