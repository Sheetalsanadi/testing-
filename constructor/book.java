class book 
{
	int bid;
	String tittle;
	double price;
	book(int bid,String tittle,double price)
	{
		this.bid=bid;
		this.tittle=tittle;
		this.price=price;
	}
	void display()
	{
		System.out.println("Book details");
		System.out.println("Book ID: "+bid);
		System.out.println("Book Tittle: "+tittle);
		System.out.println("Book Price: "+price);
		System.out.println("----------------");
	}
}
