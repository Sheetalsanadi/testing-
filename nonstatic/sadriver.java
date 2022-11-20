class sadriver 
{
	public static void main(String[] args) 
	{
		sa s1=new sa(1234567,"ABCD",30000,"CNRB001234");
		System.out.println(s1.getAcno());
		s1.setBal(25000);
		s1.display();
	}
}
