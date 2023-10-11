package inheritance_sample;

public class ChildClass extends ParentClass{
 
	public void print()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChildClass c=new ChildClass();
       c.print();
       c.sum();
	}

}
