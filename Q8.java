import java.util.Scanner;
class Q8
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		Double pa ,ri,si;
		int t;
		System.out.println("Enter principale amount");
		pa=s.nextDouble();
		System.out.println("Enter rate of intrest");
		ri=s.nextDouble();
		System.out.println("Enter time");
		t=s.nextInt();
		si=pa*ri*t/100;
		System.out.println("simple Intrest is :" +si);
	}
}