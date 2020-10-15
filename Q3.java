import java.util.Scanner;
class demo
{
	public void f(int x)
	{
	int y=x*x+3*x-7;
	System.out.println(y);

	}
	public void f1(int x)
	{
		int y=x++ + ++x;
		System.out.println("value of x is:"+x);
		System.out.println("value of y:"+y);
	}
	public void f2(int x,int y)
	{
		int z= x++ - --y - --x + x++;
		System.out.println("value of x is:"+x);
		System.out.println("value of y:"+y);
		System.out.println("value of z is:"+z);
		
	}
	public void f3(boolean x,boolean y)
	{
		boolean z=x && y ||!(x||y);
		System.out.println(z);
	}
}
class Q3
{
	public static void main(String args[])
	{
		System.out.println("Enter number");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		boolean z=s.nextBoolean();
		boolean m=s.nextBoolean();
		System.out.println("--------------------");
		demo d1=new demo();
		d1.f(x);
		System.out.println("---------------------------");
		d1.f1(x);
		System.out.println("-------------------------------");
		d1.f2(x,y);
		System.out.println("---------------------------------------------");
		d1.f3(z,m);
		

	}
}