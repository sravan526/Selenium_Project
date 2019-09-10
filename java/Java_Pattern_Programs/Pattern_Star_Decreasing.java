package Java_Pattern_Programs;

public class Pattern_Star_Decreasing 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
