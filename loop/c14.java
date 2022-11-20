class c14
{
	public static void main(String[] args) 
	{
		int num=1021;
		int pali=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(pali==rev)
		{
			System.out.println("the given number is palindrome");
		}
			else
			System.out.println("the given number is not a palindrome");
	}
}
