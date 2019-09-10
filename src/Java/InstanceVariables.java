package Java;

public class InstanceVariables //Class
{
	int i=10,j=20; // Variables declaration

	public static void main(String[] args)   //Main method
	{
		InstanceVariables t1 = new InstanceVariables();
		System.out.println(t1.i);//t1 Object
		System.out.println(t1.j);
		InstanceVariables t2 = new InstanceVariables();
		t2.i=50; //t2 objects
		t2.j=60;
		System.out.println(t2.i);
		System.out.println(t2.j);

	}

}
