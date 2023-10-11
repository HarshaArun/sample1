package multilevelinheritance_sample;

public class Child1 extends ChildClass{
	public void display()
	{
		System.out.println("Hello World \n Harsha");
	}
		public static void main(String[] args)
		{
			Child1 c=new Child1();
			c.display();
			c.print();
			c.sum();
		}
	

}
