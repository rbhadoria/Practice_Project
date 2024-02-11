package Practice;

public class Airthmatic_Exp1 
{
	public int Sum(int a ,int b) 
	{
		int c;
		c=a+b;
		System.out.println("Value of C: "+c);
	return c;	
	}
    public int Sub(int x , int y) 
    {
    	int z;
    	z=x-y;
    	System.out.println("Value of Z: "+z);
	 return z;
	}
    
    public int Multi(int r , int s ) 
    {
		int t;
		t=r*s;
		System.out.println("Value of T : "+t);
	return t;
		
	}
    
    public void Div(int p , int q ) 
    {
		int result;
		result=p/q;
		System.out.println("Result is : "+result);
	
		
	}
    public static void main(String[] args) 
    {
		Airthmatic_Exp1 ob=new Airthmatic_Exp1();
		int sumresult=ob.Sum(10, 2);
		int sumresult1=ob.Sum(sumresult, 2);
		int subresult=ob.Sub(sumresult1, 2);
		int multresut=ob.Multi(subresult, 2);
		ob.Div(multresut, 2);
	}
}
