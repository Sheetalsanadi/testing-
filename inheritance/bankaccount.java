class bankaccount 
{
	int acno;
	String name;
	double bal;
	String ifsc;
	bankaccount()
	{}
	bankaccount(int acno,String name,double bal,String ifsc)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
	}
	void accountdetails()
	{
		System.out.println("Account Details");
		System.out.println("Account Number: "+acno);
		System.out.println("Account Name: "+name);
		System.out.println("Account Balance: "+bal);
		System.out.println("Account IFSC Code: "+ifsc);
	}
}
