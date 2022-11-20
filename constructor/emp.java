class emp 
{
	int id;
	String name;
	double sal;
	long phoneno;
	emp()
	{
		
	}
	emp(int id,String name,double sal,long phoneno)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.phoneno=phoneno;
	}
	emp(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	emp(String name,double sal,long phoneno)
	{
		this.name=name;
		this.sal=sal;
		this.phoneno=phoneno;
	}
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee salary: "+sal);
		System.out.println("Employee Phone number: "+phoneno);
		System.out.println("----------------");
	}
}
