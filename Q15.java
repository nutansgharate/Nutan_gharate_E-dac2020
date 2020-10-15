import java.util.Scanner;
class Q15{

	public static void main(String args[])
	{
		int age;
		char Gender;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter age:,gender:");
		age=s.nextInt();
		Gender =s.next().charAt(0);
		if(Gender=='F')
		{
			if(age>=18)
			{
				System.out.println("You can marry");
			}
			else
			{
				System.out.println("You can not  marry");
			}	
		}
		if(Gender=='M')
		{
			if(age>=21)
			{
				System.out.println("You can marry");
			}
			else
			{
			System.out.println("You can marry");
			}
		}
		
		
	}
}