class p12 
{
	public static void main(String[] args) 
	{
		char ch='a';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
		System.out.println(ch+ " is a alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
		System.out.println(ch+ " is a digit");
		}
		else
		{
			System.out.println(ch+ " is a special character");
		}
	}
}
