class emp
{
	static int count=0;
	int eid;
	String name;
	double sal;
	void display()
	{
		System.out.println("Employee Details");
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee salary: "+sal);
		System.out.println("----------------");
	}
	{
	count++;
	eid=count;
	}
}
