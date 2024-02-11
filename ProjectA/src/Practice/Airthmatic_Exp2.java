package Practice;

public class Airthmatic_Exp2 
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
    
    public int Div(int p , int q ) 
    {
		int result;
		result=p/q;
		System.out.println("Value of Divison : "+result);
	return result;
	
	}
   
	public static void main(String[] args) 
    {
		Airthmatic_Exp2 ob=new Airthmatic_Exp2();
		int divresult=ob.Div(10, 2);
		int subresult=ob.Sub(divresult, 2);
		int sumresult=ob.Sum(subresult, 2);
		int subresult1=ob.Sub(sumresult, 2);
		ob.Div(subresult1, 2);
	}
}
