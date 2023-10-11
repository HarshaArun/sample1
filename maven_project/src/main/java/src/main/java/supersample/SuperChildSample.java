package supersample;

public class SuperChildSample extends SuperParentClass {
	public SuperChildSample()
	{
		super();
		this.sum();
	}
	public void sum()
	{
	
		//super.name=name;
		super.add();
		System.out.println("a= " + a);
		
		
	}
	
public static void main(String args[]) {
	SuperChildSample sc=new SuperChildSample();
	//sc.sum("Harsha");
	
}

}
