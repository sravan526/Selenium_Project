package Interviewprograms;

//public class ReverseString {
//   public static void main(String[] args) {
//     String input = "SRAVAN";
//      System.out.println("Before the string reverse");
//      System.out.print(""+input);
//      char[] try1 = input.toCharArray();
//     
//      System.out.println("After the string reverse");
//      for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);
//	   
//   }
//}

//import java.util.Scanner;

//public class ReverseString
//{
//	public static void main(String[] args)
//	{
//		System.out.println("Enter string to reverse:");
//		
//		Scanner read = new Scanner(System.in);
//		String str = read.nextLine();
//		String reverse = "";
//		
//		
//		for(int i = str.length() - 1; i >= 0; i--)
//		{
//			reverse = reverse + str.charAt(i);
//		}
//		
//		System.out.println("Reversed string is:");
//		System.out.println(reverse);
//	}
//}



public class ReverseString
{
	public static void main(String[] args)
	{
		String name ="Sravan";
		System.out.println("Before string reverse "+name);
		
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("After string reverse"+rev);
		
		
	}
}