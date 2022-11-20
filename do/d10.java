class d10 
{
	public static void main(String[] args) 
	{
		int num=1291;
		int pali=num;
		int rev=0;
		do
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		while (num>0);
		if(pali==rev)
		{
		System.out.println(pali+" is a palindrome");
		}
		else
			System.out.println(pali+" is not a palindrome");
	}
}
