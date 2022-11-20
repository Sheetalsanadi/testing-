class persondriver
{
	public static void main(String[] args) 
	{
		person obj=new person();
		obj.interview("ABCD");
		System.out.println(obj.name);
		System.out.println(obj.s1.salary);
		obj.s1.work();
	}
}
