class empdriver 
{
	public static void main(String[] args) 
	{
		emp m1=new emp(101,"ABCD",20000,2134567890);
		m1.display();
		emp m2=new emp(102,"MNOP",29999);
		m2.display();
		emp m3=new emp("EFGH",20000,1234567890);
		m3.display();
		emp m4=new emp();
		m4.display();
	}
}
