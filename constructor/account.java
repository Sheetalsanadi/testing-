class account 
{
	long acno;
	String name;
	double bal;
	account(long acno,String name,double bal)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
	}
	void display()
	{
		System.out.println("Account details");
		System.out.println("Account number: "+acno);
		System.out.println("Account name: "+name);
		System.out.println("Account balance: "+bal);
		System.out.println("----------------");
	}
}
