package Practice;

public class Constuctor_Student 
{
	public Constuctor_Student() 
	{ 
		this(3,5,6);
		System.out.println("Default Constructor...");
	}
	
	public Constuctor_Student(int a) 
	{
		this();
		System.out.println("One parameterized Constructor...");
	}
	
	public Constuctor_Student(int a , int b) 
	{
		this(9);
		System.out.println("two parameterized Constructor...");
	}
	
	public Constuctor_Student(int a , int b ,int c) 
	{
		System.out.println("Three parameterized Constructor...");
	}
	
	public Constuctor_Student(int a , int b ,int c , int d) 
	{
		this(3,6);
		System.out.println("Four parameterized Constructor...");
	}
	
	public static void main(String[] args) 
	{
		Constuctor_Student ob2=new Constuctor_Student(7,4,6,9);
	
	}

}
