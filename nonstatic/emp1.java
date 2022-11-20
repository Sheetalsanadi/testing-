class emp1 
{
	int id;
	String name;
	double sal;
	emp1(int id,String name,double sal)
	{
		this(id,name);
		this.sal=sal;
	}
	emp1(int id,String name)
	{
	this(id);
	this.name=name;
	}
	emp1(int id)
	{
		this();
		this.id=id;
	}
	emp1()
	{}
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee salary: "+sal);
		System.out.println("----------------");
	}
}
