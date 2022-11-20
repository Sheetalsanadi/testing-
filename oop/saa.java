class saa 
{
	long acno;
	String name;
	double bal;
	String ifsc;
	saa()
	{
	}
	saa(long acno,String name,double bal,String ifsc)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
	}
	public void withdrawn(double amt)
	{
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println(amt+" is withdrawn successfully");
			System.out.println("remaining balance: "+bal);
		}
		else
			System.out.println("insufficient balance");
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(amt+" is deposited successfully");
		System.out.println("updated balance: "+bal);
	}
	public void display()
	{
		System.out.println("Account Details");
		System.out.println("Account Number: "+acno);
		System.out.println("Account Name: "+name);
		System.out.println("Account Balance: "+bal);
		System.out.println("Account IFSC Code: "+ifsc);
		System.out.println("----------------");
	}
}
