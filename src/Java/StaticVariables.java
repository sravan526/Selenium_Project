package Java;

public class StaticVariables
{
	static String collname="Ellenki";
			int sno,smarks;
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		StaticVariables t1=new StaticVariables();
		t1.sno=101;
		t1.smarks=600;
		System.out.println(collname);
		System.out.println(t1.sno);
		System.out.println(t1.smarks);
		StaticVariables t2 =new StaticVariables();
		t2.collname=("MIT");
		t2.sno=102;
		t2.smarks=650;
		System.out.println(collname);
		System.out.println(t2.sno);
		System.out.println(t2.smarks);
		
		
		
		

	}

}
