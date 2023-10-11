package aggregation_sample;

public class Aggregation1 {
	Aggregation ag;
	String place;
	public Aggregation1(String place, Aggregation ag)
	{
		this.place=place;
		this.ag=ag;
	}
	public void print()
	{
		System.out.println("Name=" + ag.name +" "+"age " + ag.a);
		System.out.println("place=" + place);
	}
	public static void main(String args[])
	{
		Aggregation agg=new Aggregation("Arun",300);
		Aggregation1 a1=new Aggregation1("TVM",agg);
		a1.print();
	}

}
