package Practice;

public class Student 
{
    int roll_no;
    int age;
    
    public void display1()
    {
    	System.out.println("Welcome to All of You!");
    }
    
    public void display2()
    { 
    	System.out.println("Automation is very easy");
    }
    
    public static void main(String[] args) 
    {
		Student s=new Student();
		s.age=30;
		s.roll_no=24;
		s.display1();
		s.display2();
		System.out.println("Age is:"+s.age);
		System.out.println("Roll No is:"+s.roll_no);
	}
}
