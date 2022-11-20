class employee 
{
	int eid;
	String name;
	double sal;
	employee(int eid,String name,double sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}
	void display()
	{
		System.out.println("Employee details");
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+sal);
		System.out.println("----------------");
	}
}
