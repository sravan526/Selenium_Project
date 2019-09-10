package Interviewprograms;

public class Swapnumbers
{
    public static void main(String []Args)
    {
        int x=10,y=20;
        
        System.out.println("Before swapping");
        System.out.println("first number"+x);//10
        System.out.println("second number"+y);//20
        x=x+y;  //10+20=30
        y=x-y;  //30-20=10
        x=x-y;  //10-30=20
        System.out.println("after swapping");
        System.out.println("first number"+x);
        System.out.println("second number"+y);
        
        
    }
}
