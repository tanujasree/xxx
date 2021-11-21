package consructor;

 class Example
{
	String c;
	 Example(){}
	{
		
		c= "etv";
	}
	Example (String s)
	{
	  c=s;
	  }
	  
	
}

public class ConstEx 
{
	public static void main(String[]args) 
	{
	  Example e=new Example();
	System.out.println("channel name in e object is :"+e.c);
	  Example e1=new Example("santosh");
	System.out.println("channel name in e1 object is:"+e1.c);
	}

}
