import java.util.*;
public class Q12
{
public static void main(String [] args )
	{
System.out.println("enter salary of the employee :");
	Scanner sc=new Scanner(System.in);
	double sal =sc.nextDouble();
	double hra , da, gs;
	
	if (sal < 10000)
		{
		 hra=(0.10*sal);
	
		da=(90*sal/100);		
		gs= sal + hra +da;
		System.out.println("Gross salary is ="+gs);
		}
	
	else
		{
		 hra=2000;
		da=(98*sal/100);		
		gs=sal + hra +da;
		System.out.println("Gross salary is ="+gs);
		}
	} 
}