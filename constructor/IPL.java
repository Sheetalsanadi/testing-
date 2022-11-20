class IPL 
{
	String name;
	String captain;
	String coach;
	int matches;
	IPL(String name,String captain,String coach,int matches)
	{
		this.name=name;
		this.captain=captain;
		this.coach=coach;
		this.matches=matches;
	}
	void display()
	{
		System.out.println(" IPL Teams");
		System.out.println("Team Name: "+name);
		System.out.println("Team captain: "+captain);
		System.out.println("Team coach: "+coach);
		System.out.println("Team matches: "+matches);
		System.out.println("----------------");
	}
}
