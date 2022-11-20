class movies 
{
	String name;
	String hero;
	String heroine;
	String villain;
	String director;
	double rating;
	movies()
	{
		
	}
	movies(String name,String hero,String heroine,String director)
	{
		this.name=name;
		this.hero=hero;
		this.heroine=heroine;
		this.director=director;
	}
	movies(String name,String hero,String heroine,String villain,String director)
	{
		this.name=name;
		this.hero=hero;
		this.heroine=heroine;
		this.villain=villain;
		this.director=director;
	}
	movies(String name,String hero,String heroine,String villain,String director,double rating)
	{
		this.name=name;
		this.hero=hero;
		this.heroine=heroine;
		this.villain=villain;
		this.director=director;	
		this.rating=rating;
	}
	public void display()
	{
		System.out.println("Movies Details");
		System.out.println("Movie Name: "+name);
		System.out.println("Movie Hero: "+hero);
		System.out.println("Movie Heroine: "+heroine);
		System.out.println("Movie Villain: "+villain);
		System.out.println("Movie Director: "+director);
		System.out.println("Movie Rating: "+rating);
		System.out.println("----------------");
	}
}
