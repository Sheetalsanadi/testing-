class loanaccount extends bankaccount 
{
	double loanamt;
	double intrate;
	loanaccount()
	{}
	loanaccount(int acno,String name,double bal,String ifsc,double loanamt,double intrate)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
		this.loanamt=loanamt;
		this.intrate=intrate;
	}
	void accountdetails()
	{
		System.out.println("Account Details");
		System.out.println("Account Number: "+acno);
		System.out.println("Account Name: "+name);
		System.out.println("Account Balance: "+bal);
		System.out.println("Account IFSC Code: "+ifsc);
		System.out.println("Loan Amount: "+loanamt);
		System.out.println("Rate of Interest: "+intrate);
	}
}
