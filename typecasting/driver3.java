class driver3 
{
	public static void main(String[] args) 
	{
		A obj=new A();
		if(obj instanceof B)
		{
			B obj1=(B)obj;
		}
		else
		System.out.println("no instancof class B");
	}
}
