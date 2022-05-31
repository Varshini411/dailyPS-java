import java.io.*;
public class Overloading
{
	public static void main(String[] args) {
	   int a=10;
	   int b=20;
	   double c=20.25;
	   double d=25.45;
	   System.out.println(sample(a,b));
	   System.out.println(sample(c,d));
	}
	static int sample(int x,int y)
	{
	    return x+y;
	}
	static double sample(double x,double y){
	    return x+y;
	}
}