import java. util.Scanner;

class Q6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
		double radius=s.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("Area of circle is:"+area);
		 double circum= Math.PI*(2*radius);
		System.out.println("Circumference  of circle is:"+circum);
	}
}