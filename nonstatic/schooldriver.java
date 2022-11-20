class schooldriver 
{
	public static void main(String[] args) 
	{
		school c1=new school();
		c1.admission("ABCD");
		System.out.println(c1.name);
		System.out.println(c1.s1.name);
		c1.s1.bunk();
	}
}
