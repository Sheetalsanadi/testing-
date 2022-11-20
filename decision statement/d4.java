class  d4
{
	public static void main(String[] args) 
	{
		char ch='5';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			switch(ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println(ch+ " is a vowel");
				break;
				default:
					System.out.println(ch+ " is a consonant");

			}
		}
			else
		{
				System.out.println("enter a alphabet");
		}
	}
}
