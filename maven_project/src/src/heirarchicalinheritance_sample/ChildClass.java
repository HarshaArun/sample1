package heirarchicalinheritance_sample;

public class ChildClass extends ParentClass{
	public void print()
	{
		System.out.println("Hello Harsha");
		
	}
	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		c.print();
		c.sum();
	}

}
