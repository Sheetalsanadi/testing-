class m1
{
	public static void main(String[] args) 
	{
        int n=9;
		boolean p=eo(n);
		boolean q=prime(n);
		boolean r=neon(n);
		boolean s=sunny(n);
		boolean t=spy(n);
		boolean u=perfect(n);
		boolean v=strong(n);
		boolean w=arms(n);
		if (p)
		{
		   System.out.println(n+" is a even number");
		}
		else
		{
			System.out.println(n+" is a odd number");
		}
		if (q)
		{
		   System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	    if (r)
		{
		   System.out.println(n+" is a neon number");
		}
		else
		{
			System.out.println(n+" is not a neon number");
		}
		if (s)
		{
		   System.out.println(n+" is a sunny number");
		}
		else
		{
			System.out.println(n+" is not a sunny number");
		}
		if (t)
		{
		   System.out.println(n+" is a spy number");
		}
		else
		{
			System.out.println(n+" is not a spy number");
		}
		if (u)
		{
		   System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
		if (v)
		{
		   System.out.println(n+" is a strong number");
		}
		else
		{
			System.out.println(n+" is not a strong number");
		}
		if (w)
		{
		   System.out.println(n+" is a armstrong number");
		}
		else
		{
			System.out.println(n+" is not a armstrong number");
		}
	}
    public static boolean prime(int n)
	{
		int i=2;
		boolean p;
		int count=0;
		while(i<n)
		{
			if(n%i==0)
			{
				count=1;
				break;
			}
			i++;
		}
		if (count==0)
		{
		  p=true;
		}
		else
		{
	      p=false;
		}
		return p;
	}
	public static boolean eo(int n)
    {
		boolean q;
		if (n%2==0)
		{
		  q=true;
		}
		else
		{
	      q=false;
		}
		return q;
	}
	public static boolean neon(int n)
	{
		 boolean r;
		 int temp=n;
		 int sum=0;
		 int sq=n*n;
		 while (sq>0)
		 {
		  int rem=temp%10;
		  sum=sum+rem;
		  sq=sq/10;
		 }
		 if (n==sum)
		 {
		  r=true;
		 }
		 else
		 {
	      r=false;
		 }
		 return r;
	}
	public static boolean sunny(int n)
	{
		 boolean s;
		 int m=n+1;
		 int i=1;
		 int count=0;
		 while (i<=m/2)
		 {
		  int a=i*i;
		  if (m==a)
		    {
			    count=1;
			    break;
		    }
			i++;
		 }
		 if (count==1)
		    {
			    System.out.println(i+" is a square root of "+m);
		        s=true;
		    }
		 else
		 {
	         s=false;
		 }
		 return s;
	}
	public static boolean spy(int n)
	{
		 boolean t;
		 int temp=n;
		 int sum=0;
		 int prod=1;
		 while (temp>0)
		 {
		  int rem=temp%10;
		  sum=sum+rem;
		  prod=prod*rem;
		  temp=temp/10;
		 }
		 if (prod==sum)
		 {
		  t=true;
		 }
		 else
		 {
	      t=false;
		 }
		 return t;
	}
	public static boolean perfect(int n)
	{
		 boolean u;
		 int temp=n;
		 int i=1;
		 int sum=0;
		 while (i<temp)
		 {
		   if (temp%i==0)
		   {
			   sum=sum+i;
		   }
		   i++;
		 }
		 if (sum==temp)
		 {
		  u=true;
		 }
		 else
		 {
	      u=false;
		 }
		 return u;
	}
	public static boolean strong(int n)
	{
		 boolean v;
		 int temp=n;
		 int sum=0;
		 int i;
		 int rem;
		 int fact;
		 while (temp>0)
		 {
			 fact=1;
			 i=1;
		     rem=temp%10;
				 while (i<=rem)
				 {
					 fact=fact*i;
					 i++;
				 }
		         sum=sum+fact;
		         temp=temp/10;
		}
		if (n==sum)
		{
		  v=true;
		}
		else
		{
	      v=false;
		}
		return v;
	}
	public static boolean arms(int n)
	{
		 boolean w;
		 int num=n;
		 int temp=n;
		 int sum=0;
		 int digit=0;
		 while (n>0)
		 {
		   n/=10;
		   digit++;
		 }
		 while (num>0)
		 { 
           int i=digit;
		   int rem=num%10;
		   int prod=1;
		   while (i>0)
		   {
			   prod=prod*rem;
			   i--;
		   }
		   sum=sum+prod;
		   num=num/10;
		 }
		 if (sum==temp)
		 {
		  w=true;
		 }
		 else
		 {
	      w=false;
		 }
		 return w;
	}
}
