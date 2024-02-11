package Practice;

public class Student1 
{
  public void m()
  {	  
	  this.m4(4, 45, 67, 9);
	  System.out.println("Default Method");  
  }
  
  public void m1( int a )
  {
	  this.m();
	  System.out.println("One Parameterized Method");
  }
  
  public void m2(int a, int b)
  {
	  this.m1(55);
	  System.out.println("Two Parameterized Method");  
  }
  
  public void m3(int a , int b, int c)
  {
	  System.out.println("Three Parameterized Method");  
  }
  
  public void m4(int a,int b , int c , int d )
  {
	  this.m3(4, 5, 9);
	  System.out.println("Four Parameterized Method");  
  }
  
  public static void main(String[] args) 
  {
	Student1 s=new Student1();
	s.m2(3, 6);
  }
}
